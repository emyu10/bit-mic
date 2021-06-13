CREATE TABLE PfmsDb.dbo.Account (
	AccountId int IDENTITY(0,1) NOT NULL,
	AccountTitle varchar(100) NOT NULL,
	AccountDescription varchar(255) NULL,
	ParentId int NULL,
	MaxAmount money NULL,
	MinAmount money NULL,
	CurrentBalance money NULL,
	AddedDate datetime2 DEFAULT current_timestamp NOT NULL
);

ALTER TABLE PfmsDb.dbo.Account ADD CONSTRAINT Account_PK PRIMARY KEY (AccountId);

CREATE TABLE PfmsDb.dbo.Category (
	CategoryId int IDENTITY(0,1) NOT NULL,
	CategoryName varchar(100) NOT NULL,
	TransactionDirection char(1) NOT NULL,
	AddedDate datetime2 DEFAULT current_timestamp NOT NULL,
	CONSTRAINT Category_PK PRIMARY KEY (CategoryId)
);

CREATE TABLE PfmsDb.dbo.Person (
	PersonId int IDENTITY(0,1) NOT NULL,
	Name varchar(150) NOT NULL,
	FriendlyName varchar(150) NOT NULL,
	ContactNo varchar(7) NOT NULL,
	AddedDate datetime2 DEFAULT current_timestamp NOT NULL,
	CONSTRAINT Person_PK PRIMARY KEY (PersonId)
);

CREATE TABLE PfmsDb.dbo.[Transaction] (
	TransactionId int IDENTITY(0,1) NOT NULL,
	AccountId int NOT NULL,
	CategoryId int NOT NULL,
	Amount money NOT NULL,
	TransactionDetails varchar(255) NOT NULL,
	InvolvedPersonId int NULL,
	TransactionDate datetime2 NOT NULL,
	AddedDate datetime2 DEFAULT current_timestamp NOT NULL,
	CONSTRAINT Transaction_PK PRIMARY KEY (TransactionId),
	CONSTRAINT Transaction_FK FOREIGN KEY (AccountId) REFERENCES PfmsDb.dbo.Account(AccountId),
	CONSTRAINT Transaction_FK_1 FOREIGN KEY (CategoryId) REFERENCES PfmsDb.dbo.Category(CategoryId),
	CONSTRAINT Transaction_FK_2 FOREIGN KEY (InvolvedPersonId) REFERENCES PfmsDb.dbo.Person(PersonId)
);

