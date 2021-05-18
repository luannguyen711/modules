create table Registration_User_ (
	uuid_ VARCHAR(75) null,
	userId LONG not null primary key,
	companyId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	male BOOLEAN,
	birthDay DATE null,
	password_ VARCHAR(75) null,
	confirmPassword VARCHAR(75) null,
	homePhone VARCHAR(75) null,
	mobilePhone VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	zipCode VARCHAR(75) null,
	securityQuestion VARCHAR(75) null,
	answer VARCHAR(75) null,
	termsOfUse BOOLEAN
);