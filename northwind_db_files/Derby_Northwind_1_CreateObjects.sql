CREATE TABLE Region 
( 
  RegionID  INTEGER NOT NULL, 
  RegionDescription  CHAR(50) NOT NULL, 
CONSTRAINT PK_Region 
  PRIMARY KEY (RegionID)
)
;

CREATE TABLE Territories 
( 
  TerritoryID  VARCHAR(20) NOT NULL, 
  TerritoryDescription  CHAR(50) NOT NULL, 
  RegionID  INTEGER NOT NULL, 
CONSTRAINT PK_Territories 
  PRIMARY KEY (TerritoryID), 
CONSTRAINT FK_Territories_Region FOREIGN KEY (RegionID) REFERENCES Region(RegionID)
) 
; 

CREATE TABLE Categories 
( 
  CategoryID  INTEGER NOT NULL,
  CategoryName  VARCHAR(15) NOT NULL, 
  Description  VARCHAR(300), 
  Picture  BLOB ,
CONSTRAINT PK_Categories 
  PRIMARY KEY (CategoryID)
) 
; 

CREATE TABLE Suppliers 
( 
  SupplierID  INTEGER NOT NULL, 
  CompanyName  VARCHAR(40) NOT NULL, 
  ContactName  VARCHAR(30), 
  ContactTitle  VARCHAR(30), 
  Address  VARCHAR(60), 
  City  VARCHAR(15), 
  Region  VARCHAR(15), 
  PostalCode  VARCHAR(10), 
  Country  VARCHAR(15), 
  Phone  VARCHAR(24), 
  Fax  VARCHAR(24), 
  HomePage  VARCHAR(200), 
CONSTRAINT PK_Suppliers 
  PRIMARY KEY (SupplierID)
) 
; 

CREATE TABLE Products 
( 
  ProductID  INTEGER NOT NULL, 
  ProductName  VARCHAR(40) NOT NULL, 
  SupplierID  INTEGER, 
  CategoryID  INTEGER, 
  QuantityPerUnit  VARCHAR(20), 
  UnitPrice  DECIMAL(9,4), 
  UnitsInStock  INTEGER, 
  UnitsOnOrder  INTEGER, 
  ReorderLevel  INTEGER, 
  Discontinued  INTEGER NOT NULL,
CONSTRAINT PK_Products 
  PRIMARY KEY (ProductID), 
CONSTRAINT CK_Products_UnitPrice   CHECK ((UnitPrice >= 0)), 
CONSTRAINT CK_ReorderLevel   CHECK ((ReorderLevel >= 0)), 
CONSTRAINT CK_UnitsInStock   CHECK ((UnitsInStock >= 0)), 
CONSTRAINT CK_UnitsOnOrder   CHECK ((UnitsOnOrder >= 0)), 
CONSTRAINT FK_Products_Categories FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID), 
CONSTRAINT FK_Products_Suppliers FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
) 
; 

CREATE TABLE Shippers 
( 
  ShipperID  INTEGER NOT NULL, 
  CompanyName  VARCHAR(40) NOT NULL, 
  Phone  VARCHAR(24), 
CONSTRAINT PK_Shippers 
  PRIMARY KEY (ShipperID)
) 
; 

CREATE TABLE Customers 
( 
  CustomerID  CHAR(5) NOT NULL, 
  CompanyName  VARCHAR(40) NOT NULL, 
  ContactName  VARCHAR(30), 
  ContactTitle  VARCHAR(30), 
  Address  VARCHAR(60), 
  City  VARCHAR(15), 
  Region  VARCHAR(15), 
  PostalCode  VARCHAR(10), 
  Country  VARCHAR(15), 
  Phone  VARCHAR(24), 
  Fax  VARCHAR(24), 
CONSTRAINT PK_Customers 
  PRIMARY KEY (CustomerID)
) 
; 

CREATE TABLE Employees 
( 
  EmployeeID  INTEGER NOT NULL, 
  LastName  VARCHAR(20) NOT NULL, 
  FirstName  VARCHAR(10) NOT NULL, 
  Title  VARCHAR(30), 
  TitleOfCourtesy  VARCHAR(25), 
  BirthDate  DATE, 
  HireDate  DATE, 
  Address  VARCHAR(60), 
  City  VARCHAR(15), 
  Region  VARCHAR(15), 
  PostalCode  VARCHAR(10), 
  Country  VARCHAR(15), 
  HomePhone  VARCHAR(24), 
  Extension  VARCHAR(4), 
  Photo  BLOB,
  Notes  VARCHAR(600), 
  ReportsTo  INTEGER, 
  PhotoPath  VARCHAR(255), 
CONSTRAINT PK_Employees 
  PRIMARY KEY (EmployeeID), 
CONSTRAINT FK_Employees_Employees FOREIGN KEY (ReportsTo) REFERENCES Employees(EmployeeID)
) 
; 

CREATE TABLE EmployeeTerritories 
( 
  EmployeeID  INTEGER NOT NULL, 
  TerritoryID  VARCHAR(20) NOT NULL, 
CONSTRAINT PK_EmpTerritories 
  PRIMARY KEY (EmployeeID, TerritoryID), 
CONSTRAINT FK_EmpTerri_Employees FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID), 
CONSTRAINT FK_EmpTerri_Territories FOREIGN KEY (TerritoryID) REFERENCES Territories(TerritoryID)
) 
; 

CREATE TABLE CustomerDemographics 
( 
  CustomerTypeID  CHAR(10) NOT NULL, 
  CustomerDesc  CLOB,
CONSTRAINT PK_CustomerDemographics 
  PRIMARY KEY (CustomerTypeID)
) 
; 

CREATE TABLE CustomerCustomerDemo 
( 
  CustomerID  CHAR(5) NOT NULL, 
  CustomerTypeID  CHAR(10) NOT NULL, 
CONSTRAINT PK_CustomerDemo 
  PRIMARY KEY (CustomerID, CustomerTypeID), 
CONSTRAINT FK_CustomerDemo FOREIGN KEY (CustomerTypeID) REFERENCES CustomerDemographics(CustomerTypeID), 
CONSTRAINT FK_CustomerDemo_Customers FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
) 
; 

CREATE TABLE Orders 
( 
  OrderID  INTEGER NOT NULL, 
  CustomerID  CHAR(5), 
  EmployeeID  INTEGER, 
  TerritoryID  VARCHAR(20), 
  OrderDate  DATE, 
  RequiredDate  DATE, 
  ShippedDate  DATE, 
  ShipVia  INTEGER, 
  Freight  INTEGER, 
  ShipName  VARCHAR(40), 
  ShipAddress  VARCHAR(60), 
  ShipCity  VARCHAR(15), 
  ShipRegion  VARCHAR(15), 
  ShipPostalCode  VARCHAR(10), 
  ShipCountry  VARCHAR(15), 
CONSTRAINT PK_Orders 
  PRIMARY KEY (OrderID), 
CONSTRAINT FK_Orders_Customers FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID), 
CONSTRAINT FK_Orders_Employees FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID), 
CONSTRAINT FK_Orders_Shippers FOREIGN KEY (ShipVia) REFERENCES Shippers(ShipperID),
CONSTRAINT FK_Orders_Territories FOREIGN KEY (TerritoryID) REFERENCES Territories(TerritoryID)
) 
; 

CREATE TABLE OrderDetails 
( 
  OrderID  INTEGER NOT NULL, 
  ProductID  INTEGER NOT NULL, 
  UnitPrice  DECIMAL(9,4) NOT NULL, 
  Quantity  INTEGER NOT NULL, 
  Discount  DECIMAL(4,2) NOT NULL, 
CONSTRAINT PK_Order_Details 
  PRIMARY KEY (OrderID, ProductID), 
CONSTRAINT CK_Discount   CHECK ((Discount >= 0 and Discount <= 1)), 
CONSTRAINT CK_Quantity   CHECK ((Quantity > 0)), 
CONSTRAINT CK_UnitPrice   CHECK ((UnitPrice >= 0)), 
CONSTRAINT FK_OrderDetails_Orders FOREIGN KEY (OrderID) REFERENCES Orders(OrderID), 
CONSTRAINT FK_OrderDetails_Products FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
)
;

