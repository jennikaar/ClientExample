
package cz.muni.fi.pa053;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.muni.fi.pa053 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Balance_QNAME = new QName("http://pa053.fi.muni.cz/", "balance");
    private final static QName _BalanceResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "balanceResponse");
    private final static QName _Buy_QNAME = new QName("http://pa053.fi.muni.cz/", "buy");
    private final static QName _BuyResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "buyResponse");
    private final static QName _CreateAccount_QNAME = new QName("http://pa053.fi.muni.cz/", "createAccount");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "createAccountResponse");
    private final static QName _HowMuchToFinish_QNAME = new QName("http://pa053.fi.muni.cz/", "howMuchToFinish");
    private final static QName _HowMuchToFinishResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "howMuchToFinishResponse");
    private final static QName _Info_QNAME = new QName("http://pa053.fi.muni.cz/", "info");
    private final static QName _InfoResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "infoResponse");
    private final static QName _List_QNAME = new QName("http://pa053.fi.muni.cz/", "list");
    private final static QName _ListResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "listResponse");
    private final static QName _Own_QNAME = new QName("http://pa053.fi.muni.cz/", "own");
    private final static QName _OwnResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "ownResponse");
    private final static QName _Sell_QNAME = new QName("http://pa053.fi.muni.cz/", "sell");
    private final static QName _SellResponse_QNAME = new QName("http://pa053.fi.muni.cz/", "sellResponse");
    private final static QName _UnknownUser_QNAME = new QName("http://pa053.fi.muni.cz/", "UnknownUser");
    private final static QName _CannotProceed_QNAME = new QName("http://pa053.fi.muni.cz/", "CannotProceed");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.muni.fi.pa053
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Balance }
     * 
     */
    public Balance createBalance() {
        return new Balance();
    }

    /**
     * Create an instance of {@link BalanceResponse }
     * 
     */
    public BalanceResponse createBalanceResponse() {
        return new BalanceResponse();
    }

    /**
     * Create an instance of {@link Buy }
     * 
     */
    public Buy createBuy() {
        return new Buy();
    }

    /**
     * Create an instance of {@link BuyResponse }
     * 
     */
    public BuyResponse createBuyResponse() {
        return new BuyResponse();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link HowMuchToFinish }
     * 
     */
    public HowMuchToFinish createHowMuchToFinish() {
        return new HowMuchToFinish();
    }

    /**
     * Create an instance of {@link HowMuchToFinishResponse }
     * 
     */
    public HowMuchToFinishResponse createHowMuchToFinishResponse() {
        return new HowMuchToFinishResponse();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link InfoResponse }
     * 
     */
    public InfoResponse createInfoResponse() {
        return new InfoResponse();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link Own }
     * 
     */
    public Own createOwn() {
        return new Own();
    }

    /**
     * Create an instance of {@link OwnResponse }
     * 
     */
    public OwnResponse createOwnResponse() {
        return new OwnResponse();
    }

    /**
     * Create an instance of {@link Sell }
     * 
     */
    public Sell createSell() {
        return new Sell();
    }

    /**
     * Create an instance of {@link SellResponse }
     * 
     */
    public SellResponse createSellResponse() {
        return new SellResponse();
    }

    /**
     * Create an instance of {@link UnknownUser }
     * 
     */
    public UnknownUser createUnknownUser() {
        return new UnknownUser();
    }

    /**
     * Create an instance of {@link CannotProceed }
     * 
     */
    public CannotProceed createCannotProceed() {
        return new CannotProceed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Balance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Balance }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "balance")
    public JAXBElement<Balance> createBalance(Balance value) {
        return new JAXBElement<Balance>(_Balance_QNAME, Balance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BalanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "balanceResponse")
    public JAXBElement<BalanceResponse> createBalanceResponse(BalanceResponse value) {
        return new JAXBElement<BalanceResponse>(_BalanceResponse_QNAME, BalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Buy }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "buy")
    public JAXBElement<Buy> createBuy(Buy value) {
        return new JAXBElement<Buy>(_Buy_QNAME, Buy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "buyResponse")
    public JAXBElement<BuyResponse> createBuyResponse(BuyResponse value) {
        return new JAXBElement<BuyResponse>(_BuyResponse_QNAME, BuyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<CreateAccount>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HowMuchToFinish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HowMuchToFinish }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "howMuchToFinish")
    public JAXBElement<HowMuchToFinish> createHowMuchToFinish(HowMuchToFinish value) {
        return new JAXBElement<HowMuchToFinish>(_HowMuchToFinish_QNAME, HowMuchToFinish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HowMuchToFinishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HowMuchToFinishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "howMuchToFinishResponse")
    public JAXBElement<HowMuchToFinishResponse> createHowMuchToFinishResponse(HowMuchToFinishResponse value) {
        return new JAXBElement<HowMuchToFinishResponse>(_HowMuchToFinishResponse_QNAME, HowMuchToFinishResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Info }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "info")
    public JAXBElement<Info> createInfo(Info value) {
        return new JAXBElement<Info>(_Info_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "infoResponse")
    public JAXBElement<InfoResponse> createInfoResponse(InfoResponse value) {
        return new JAXBElement<InfoResponse>(_InfoResponse_QNAME, InfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "list")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "listResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Own }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Own }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "own")
    public JAXBElement<Own> createOwn(Own value) {
        return new JAXBElement<Own>(_Own_QNAME, Own.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "ownResponse")
    public JAXBElement<OwnResponse> createOwnResponse(OwnResponse value) {
        return new JAXBElement<OwnResponse>(_OwnResponse_QNAME, OwnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sell }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sell }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "sell")
    public JAXBElement<Sell> createSell(Sell value) {
        return new JAXBElement<Sell>(_Sell_QNAME, Sell.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SellResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "sellResponse")
    public JAXBElement<SellResponse> createSellResponse(SellResponse value) {
        return new JAXBElement<SellResponse>(_SellResponse_QNAME, SellResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnknownUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "UnknownUser")
    public JAXBElement<UnknownUser> createUnknownUser(UnknownUser value) {
        return new JAXBElement<UnknownUser>(_UnknownUser_QNAME, UnknownUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CannotProceed }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CannotProceed }{@code >}
     */
    @XmlElementDecl(namespace = "http://pa053.fi.muni.cz/", name = "CannotProceed")
    public JAXBElement<CannotProceed> createCannotProceed(CannotProceed value) {
        return new JAXBElement<CannotProceed>(_CannotProceed_QNAME, CannotProceed.class, null, value);
    }

}
