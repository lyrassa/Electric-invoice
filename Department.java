class Department {
    private String departmentName;
    private String adminID;
    private String adminPassword;
    
    public Department(String departmentName, String adminID, String adminPassword) {
        this.departmentName = departmentName;
        this.adminID = adminID;
        this.adminPassword = adminPassword;
    }
    public boolean logInAccount(String name, String adminID, String adminPassword) {
        return false;
    }
    
    public void registerHouseOwner_AccInformation() { 
    }
    
    public void inputInformation() {    
    }
    
    public void updateInformation() {
    }
    
    public void deleteInformation() {
    }
    
    public void inputTransaction() {
    }
    
    public void getTransaction() {
    }

}

class HouseOwner_AccInformation extends Department {
    private String userID;
    private String userName;
    private String userAddress;
    private String userPhoneNumber;
    private String userFuseboxCode;
    
    public HouseOwner_AccInformation(String departmentName, String adminID, String adminPassword,
                                    String userID, String userName, String userAddress, 
                                    String userPhoneNumber, String userFuseboxCode) {
        super(departmentName, adminID, adminPassword);
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
        this.userFuseboxCode = userFuseboxCode;
    }
    public String getID(){
        return userID;
    }
    public String getName(){
        return userName;
    }
    public String getAddress(){
        return userAddress;
    }
    public String getPhoneNumber(){
        return userPhoneNumber;
    }
    public void setID(String id){
        this.userID=id;
    }
    public void setName(String name){
        this.userName=name;
    }
    public void setAddress(String address){
        this.userAddress=address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.userPhoneNumber=phoneNumber;
    }
    public void setFuseboxCode(String fuseboxCode){
        this.userFuseboxCode=fuseboxCode;
    }
    //@Override
}

class Transaction extends HouseOwner_AccInformation {
    private String transactionID;
    private String date;
    private String payDueDate;
    private String arrearsDueDate;
    private double totalPrice;
    private String paymentStatus;
    
    public Transaction(String departmentName, String adminID, String adminPassword,
                       String userID, String userName, String userAddress, 
                       String userPhoneNumber, String userFuseboxCode,
                       String transactionID, String date, String payDueDate, 
                       String arrearsDueDate, double totalPrice, String paymentStatus) {
        super(departmentName, adminID, adminPassword, userID, userName, userAddress,
              userPhoneNumber, userFuseboxCode);
        this.transactionID = transactionID;
        this.date = date;
        this.payDueDate = payDueDate;
        this.arrearsDueDate = arrearsDueDate;
        this.totalPrice = totalPrice;
        this.paymentStatus = paymentStatus;
    }
    public String getUserID(){
        return userID;
    }
    public String getUserName(){
        return userName;
    }
}

class HouseOwner extends Transaction {
    private String userPassword;
    
    public HouseOwner(String departmentName, String adminID, String adminPassword,
                      String userID, String userName, String userAddress, 
                      String userPhoneNumber, String userFuseboxCode,
                      String transactionID, String date, String payDueDate, 
                      String arrearsDueDate, double totalPrice, String paymentStatus,
                      String userPassword) {
        super(departmentName, adminID, adminPassword, userID, userName, userAddress,
              userPhoneNumber, userFuseboxCode, transactionID, date, payDueDate,
              arrearsDueDate, totalPrice, paymentStatus);
        this.userPassword = userPassword;
    }
    
    public boolean logIn(String userPhoneNumber, String userID, String userPassword){
        return false;
    }
    public void getTransaction(){
    }
    public void viewHistoryTransaction(){   
    }
    public void deleteHistoryInvoice(){
    }
    public void makeTransaction(){
    }
}