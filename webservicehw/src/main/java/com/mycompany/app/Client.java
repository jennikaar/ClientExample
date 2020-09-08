/*
 * Client to web service client.
 * 
 * Maven instructions: 
 * Compile Client with mvn Run Client in project-folder (webservicehw)
 * And run Client with mvn exec:java. 
 * pom.xml contains path to class and http://andromeda.fi.muni.cz/~xbatko/homework2 
 */
package com.mycompany.app;

import cz.muni.fi.pa053.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jenni Kääriäinen
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
	
	StockMarket_Service service = new StockMarket_Service();
	StockMarket port = service.getStockMarketImplPort();
	String mail = "503310@mail.muni.cz";
	String token = port.createAccount(mail);
	
	//Printing out general info
	try{
		System.out.println("Token is: " + token);
		int balance = port.balance(token);
		System.out.println("My balance is : " + balance);
		int needed = port.howMuchToFinish(token);
		System.out.println("How much is needed to finish: " + needed);
	}
	catch (UnknownUser_Exception e){
		System.out.println(e.getFaultInfo());
	}
	
	List<String> stocklist = new ArrayList();
	stocklist = port.list();
	System.out.println( "List of stocks: " + stocklist);
	System.out.println("Stocks and their prices: ");
	for(String stock : stocklist){
		System.out.println(stock + ": " + port.info(stock));
	}
	
	//Calculates the average price
	int stockprice_1 = 0;
	int stockprice_2 = 0;
	int stockprice_3 = 0;
	int stockprice_4 = 0;
	for(int i = 0; i<16; i++){
		if (i==0 | i==4 | i== 8 |i ==12)stockprice_1 += port.info(stocklist.get(0));
		if (i==1 | i==5 | i==9 |i==13)stockprice_2 += port.info(stocklist.get(1));
		if (i==2 | i==6 | i==10 |i==14)stockprice_3 += port.info(stocklist.get(2));
		if (i==3 | i==7 | i== 11| i== 15) stockprice_4 += port.info(stocklist.get(3));
	}
	int medium_stock_1 = stockprice_1 / 4;
	int medium_stock_2 = stockprice_2 / 4;
	int medium_stock_3 = stockprice_3 / 4;			
	int medium_stock_4 = stockprice_4 / 4;
	
	int[] medium_stock = {medium_stock_1,medium_stock_2,medium_stock_3,medium_stock_4};
	
	System.out.println("Stock mediums : " + medium_stock_1 + " " + medium_stock_2 + " " + medium_stock_3 + " " + medium_stock_4);

	System.out.println("Next phase can take time... Be patient and you will see balance after each buy and sell");
	// Will go on until balance is doubled. 
	while(port.howMuchToFinish(token) > 0){
		try{
			if (port.balance(token) == 0) { 
				System.out.println("Oops");
				break;
			}
			String did_buy = "yes";
			String did_sell = "yes";
			/**
			* Some code hidden because course work and do not want to give out all code if this still in use
			**/
			if(did_buy.equals("yes") | did_sell.equals("yes")){
				System.out.println("Current balance and my account owns these stocks: ");
				System.out.println("Balance: " + port.balance(token));
				for(String stock : stocklist){
					System.out.println(stock + " " + port.own(token, stock));
				}
				System.out.println("And current needed money to finish: " + port.howMuchToFinish(token));
			}
		}
		catch (CannotProceed_Exception e){
			System.out.println(e.getFaultInfo());
		}
	}
	
	//Will print out the eventual balance and what stocks are still owned
	System.out.println("Balance is doubled and my account owns these stocks: ");
	System.out.println(port.balance(token));
	for(String stock : stocklist){
		System.out.println(stock + " " + port.own(token, stock));
	}
	
    }
}
