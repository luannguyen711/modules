/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.registration.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.registration.model.User_;
import com.liferay.training.registration.model.User_Model;
import com.liferay.training.registration.model.User_Soap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the User_ service. Represents a row in the &quot;Registration_User_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>User_Model</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link User_Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_Impl
 * @generated
 */
@JSON(strict = true)
public class User_ModelImpl extends BaseModelImpl<User_> implements User_Model {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user_ model instance should use the <code>User_</code> interface instead.
	 */
	public static final String TABLE_NAME = "Registration_User_";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"userId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"firstName", Types.VARCHAR}, {"lastName", Types.VARCHAR},
		{"emailAddress", Types.VARCHAR}, {"male", Types.BOOLEAN},
		{"birthDay", Types.TIMESTAMP}, {"password_", Types.VARCHAR},
		{"confirmPassword", Types.VARCHAR}, {"homePhone", Types.VARCHAR},
		{"mobilePhone", Types.VARCHAR}, {"address1", Types.VARCHAR},
		{"address2", Types.VARCHAR}, {"city", Types.VARCHAR},
		{"state_", Types.VARCHAR}, {"zipCode", Types.VARCHAR},
		{"securityQuestion", Types.VARCHAR}, {"answer", Types.VARCHAR},
		{"termsOfUse", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("male", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("birthDay", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("password_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("confirmPassword", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("homePhone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mobilePhone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address1", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address2", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("state_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zipCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("securityQuestion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("answer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("termsOfUse", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Registration_User_ (uuid_ VARCHAR(75) null,userId LONG not null primary key,companyId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,firstName VARCHAR(75) null,lastName VARCHAR(75) null,emailAddress VARCHAR(75) null,male BOOLEAN,birthDay DATE null,password_ VARCHAR(75) null,confirmPassword VARCHAR(75) null,homePhone VARCHAR(75) null,mobilePhone VARCHAR(75) null,address1 VARCHAR(75) null,address2 VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,zipCode VARCHAR(75) null,securityQuestion VARCHAR(75) null,answer VARCHAR(75) null,termsOfUse BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table Registration_User_";

	public static final String ORDER_BY_JPQL = " ORDER BY user_.userId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Registration_User_.userId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long USERNAME_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long USERID_COLUMN_BITMASK = 8L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static User_ toModel(User_Soap soapModel) {
		if (soapModel == null) {
			return null;
		}

		User_ model = new User_Impl();

		model.setUuid(soapModel.getUuid());
		model.setUserId(soapModel.getUserId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setFirstName(soapModel.getFirstName());
		model.setLastName(soapModel.getLastName());
		model.setEmailAddress(soapModel.getEmailAddress());
		model.setMale(soapModel.isMale());
		model.setBirthDay(soapModel.getBirthDay());
		model.setPassword(soapModel.getPassword());
		model.setConfirmPassword(soapModel.getConfirmPassword());
		model.setHomePhone(soapModel.getHomePhone());
		model.setMobilePhone(soapModel.getMobilePhone());
		model.setAddress1(soapModel.getAddress1());
		model.setAddress2(soapModel.getAddress2());
		model.setCity(soapModel.getCity());
		model.setState(soapModel.getState());
		model.setZipCode(soapModel.getZipCode());
		model.setSecurityQuestion(soapModel.getSecurityQuestion());
		model.setAnswer(soapModel.getAnswer());
		model.setTermsOfUse(soapModel.isTermsOfUse());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<User_> toModels(User_Soap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<User_> models = new ArrayList<User_>(soapModels.length);

		for (User_Soap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public User_ModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return User_.class;
	}

	@Override
	public String getModelClassName() {
		return User_.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<User_, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<User_, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<User_, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((User_)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<User_, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<User_, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((User_)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<User_, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<User_, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, User_>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			User_.class.getClassLoader(), User_.class, ModelWrapper.class);

		try {
			Constructor<User_> constructor =
				(Constructor<User_>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<User_, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<User_, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<User_, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<User_, Object>>();
		Map<String, BiConsumer<User_, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<User_, ?>>();

		attributeGetterFunctions.put("uuid", User_::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<User_, String>)User_::setUuid);
		attributeGetterFunctions.put("userId", User_::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<User_, Long>)User_::setUserId);
		attributeGetterFunctions.put("companyId", User_::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<User_, Long>)User_::setCompanyId);
		attributeGetterFunctions.put("userName", User_::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<User_, String>)User_::setUserName);
		attributeGetterFunctions.put("createDate", User_::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<User_, Date>)User_::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", User_::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<User_, Date>)User_::setModifiedDate);
		attributeGetterFunctions.put("firstName", User_::getFirstName);
		attributeSetterBiConsumers.put(
			"firstName", (BiConsumer<User_, String>)User_::setFirstName);
		attributeGetterFunctions.put("lastName", User_::getLastName);
		attributeSetterBiConsumers.put(
			"lastName", (BiConsumer<User_, String>)User_::setLastName);
		attributeGetterFunctions.put("emailAddress", User_::getEmailAddress);
		attributeSetterBiConsumers.put(
			"emailAddress", (BiConsumer<User_, String>)User_::setEmailAddress);
		attributeGetterFunctions.put("male", User_::getMale);
		attributeSetterBiConsumers.put(
			"male", (BiConsumer<User_, Boolean>)User_::setMale);
		attributeGetterFunctions.put("birthDay", User_::getBirthDay);
		attributeSetterBiConsumers.put(
			"birthDay", (BiConsumer<User_, Date>)User_::setBirthDay);
		attributeGetterFunctions.put("password", User_::getPassword);
		attributeSetterBiConsumers.put(
			"password", (BiConsumer<User_, String>)User_::setPassword);
		attributeGetterFunctions.put(
			"confirmPassword", User_::getConfirmPassword);
		attributeSetterBiConsumers.put(
			"confirmPassword",
			(BiConsumer<User_, String>)User_::setConfirmPassword);
		attributeGetterFunctions.put("homePhone", User_::getHomePhone);
		attributeSetterBiConsumers.put(
			"homePhone", (BiConsumer<User_, String>)User_::setHomePhone);
		attributeGetterFunctions.put("mobilePhone", User_::getMobilePhone);
		attributeSetterBiConsumers.put(
			"mobilePhone", (BiConsumer<User_, String>)User_::setMobilePhone);
		attributeGetterFunctions.put("address1", User_::getAddress1);
		attributeSetterBiConsumers.put(
			"address1", (BiConsumer<User_, String>)User_::setAddress1);
		attributeGetterFunctions.put("address2", User_::getAddress2);
		attributeSetterBiConsumers.put(
			"address2", (BiConsumer<User_, String>)User_::setAddress2);
		attributeGetterFunctions.put("city", User_::getCity);
		attributeSetterBiConsumers.put(
			"city", (BiConsumer<User_, String>)User_::setCity);
		attributeGetterFunctions.put("state", User_::getState);
		attributeSetterBiConsumers.put(
			"state", (BiConsumer<User_, String>)User_::setState);
		attributeGetterFunctions.put("zipCode", User_::getZipCode);
		attributeSetterBiConsumers.put(
			"zipCode", (BiConsumer<User_, String>)User_::setZipCode);
		attributeGetterFunctions.put(
			"securityQuestion", User_::getSecurityQuestion);
		attributeSetterBiConsumers.put(
			"securityQuestion",
			(BiConsumer<User_, String>)User_::setSecurityQuestion);
		attributeGetterFunctions.put("answer", User_::getAnswer);
		attributeSetterBiConsumers.put(
			"answer", (BiConsumer<User_, String>)User_::setAnswer);
		attributeGetterFunctions.put("termsOfUse", User_::getTermsOfUse);
		attributeSetterBiConsumers.put(
			"termsOfUse", (BiConsumer<User_, Boolean>)User_::setTermsOfUse);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_columnBitmask |= USERNAME_COLUMN_BITMASK;

		if (_originalUserName == null) {
			_originalUserName = _userName;
		}

		_userName = userName;
	}

	public String getOriginalUserName() {
		return GetterUtil.getString(_originalUserName);
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return "";
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public boolean getMale() {
		return _male;
	}

	@JSON
	@Override
	public boolean isMale() {
		return _male;
	}

	@Override
	public void setMale(boolean male) {
		_male = male;
	}

	@JSON
	@Override
	public Date getBirthDay() {
		return _birthDay;
	}

	@Override
	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	@JSON
	@Override
	public String getPassword() {
		if (_password == null) {
			return "";
		}
		else {
			return _password;
		}
	}

	@Override
	public void setPassword(String password) {
		_password = password;
	}

	@JSON
	@Override
	public String getConfirmPassword() {
		if (_confirmPassword == null) {
			return "";
		}
		else {
			return _confirmPassword;
		}
	}

	@Override
	public void setConfirmPassword(String confirmPassword) {
		_confirmPassword = confirmPassword;
	}

	@JSON
	@Override
	public String getHomePhone() {
		if (_homePhone == null) {
			return "";
		}
		else {
			return _homePhone;
		}
	}

	@Override
	public void setHomePhone(String homePhone) {
		_homePhone = homePhone;
	}

	@JSON
	@Override
	public String getMobilePhone() {
		if (_mobilePhone == null) {
			return "";
		}
		else {
			return _mobilePhone;
		}
	}

	@Override
	public void setMobilePhone(String mobilePhone) {
		_mobilePhone = mobilePhone;
	}

	@JSON
	@Override
	public String getAddress1() {
		if (_address1 == null) {
			return "";
		}
		else {
			return _address1;
		}
	}

	@Override
	public void setAddress1(String address1) {
		_address1 = address1;
	}

	@JSON
	@Override
	public String getAddress2() {
		if (_address2 == null) {
			return "";
		}
		else {
			return _address2;
		}
	}

	@Override
	public void setAddress2(String address2) {
		_address2 = address2;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return "";
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@JSON
	@Override
	public String getZipCode() {
		if (_zipCode == null) {
			return "";
		}
		else {
			return _zipCode;
		}
	}

	@Override
	public void setZipCode(String zipCode) {
		_zipCode = zipCode;
	}

	@JSON
	@Override
	public String getSecurityQuestion() {
		if (_securityQuestion == null) {
			return "";
		}
		else {
			return _securityQuestion;
		}
	}

	@Override
	public void setSecurityQuestion(String securityQuestion) {
		_securityQuestion = securityQuestion;
	}

	@JSON
	@Override
	public String getAnswer() {
		if (_answer == null) {
			return "";
		}
		else {
			return _answer;
		}
	}

	@Override
	public void setAnswer(String answer) {
		_answer = answer;
	}

	@JSON
	@Override
	public boolean getTermsOfUse() {
		return _termsOfUse;
	}

	@JSON
	@Override
	public boolean isTermsOfUse() {
		return _termsOfUse;
	}

	@Override
	public void setTermsOfUse(boolean termsOfUse) {
		_termsOfUse = termsOfUse;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(User_.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), User_.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public User_ toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, User_>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		User_Impl user_Impl = new User_Impl();

		user_Impl.setUuid(getUuid());
		user_Impl.setUserId(getUserId());
		user_Impl.setCompanyId(getCompanyId());
		user_Impl.setUserName(getUserName());
		user_Impl.setCreateDate(getCreateDate());
		user_Impl.setModifiedDate(getModifiedDate());
		user_Impl.setFirstName(getFirstName());
		user_Impl.setLastName(getLastName());
		user_Impl.setEmailAddress(getEmailAddress());
		user_Impl.setMale(isMale());
		user_Impl.setBirthDay(getBirthDay());
		user_Impl.setPassword(getPassword());
		user_Impl.setConfirmPassword(getConfirmPassword());
		user_Impl.setHomePhone(getHomePhone());
		user_Impl.setMobilePhone(getMobilePhone());
		user_Impl.setAddress1(getAddress1());
		user_Impl.setAddress2(getAddress2());
		user_Impl.setCity(getCity());
		user_Impl.setState(getState());
		user_Impl.setZipCode(getZipCode());
		user_Impl.setSecurityQuestion(getSecurityQuestion());
		user_Impl.setAnswer(getAnswer());
		user_Impl.setTermsOfUse(isTermsOfUse());

		user_Impl.resetOriginalValues();

		return user_Impl;
	}

	@Override
	public int compareTo(User_ user_) {
		long primaryKey = user_.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof User_)) {
			return false;
		}

		User_ user_ = (User_)obj;

		long primaryKey = user_.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		User_ModelImpl user_ModelImpl = this;

		user_ModelImpl._originalUuid = user_ModelImpl._uuid;

		user_ModelImpl._originalCompanyId = user_ModelImpl._companyId;

		user_ModelImpl._setOriginalCompanyId = false;

		user_ModelImpl._originalUserName = user_ModelImpl._userName;

		user_ModelImpl._setModifiedDate = false;

		user_ModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<User_> toCacheModel() {
		User_CacheModel user_CacheModel = new User_CacheModel();

		user_CacheModel.uuid = getUuid();

		String uuid = user_CacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			user_CacheModel.uuid = null;
		}

		user_CacheModel.userId = getUserId();

		user_CacheModel.companyId = getCompanyId();

		user_CacheModel.userName = getUserName();

		String userName = user_CacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			user_CacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			user_CacheModel.createDate = createDate.getTime();
		}
		else {
			user_CacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			user_CacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			user_CacheModel.modifiedDate = Long.MIN_VALUE;
		}

		user_CacheModel.firstName = getFirstName();

		String firstName = user_CacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			user_CacheModel.firstName = null;
		}

		user_CacheModel.lastName = getLastName();

		String lastName = user_CacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			user_CacheModel.lastName = null;
		}

		user_CacheModel.emailAddress = getEmailAddress();

		String emailAddress = user_CacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			user_CacheModel.emailAddress = null;
		}

		user_CacheModel.male = isMale();

		Date birthDay = getBirthDay();

		if (birthDay != null) {
			user_CacheModel.birthDay = birthDay.getTime();
		}
		else {
			user_CacheModel.birthDay = Long.MIN_VALUE;
		}

		user_CacheModel.password = getPassword();

		String password = user_CacheModel.password;

		if ((password != null) && (password.length() == 0)) {
			user_CacheModel.password = null;
		}

		user_CacheModel.confirmPassword = getConfirmPassword();

		String confirmPassword = user_CacheModel.confirmPassword;

		if ((confirmPassword != null) && (confirmPassword.length() == 0)) {
			user_CacheModel.confirmPassword = null;
		}

		user_CacheModel.homePhone = getHomePhone();

		String homePhone = user_CacheModel.homePhone;

		if ((homePhone != null) && (homePhone.length() == 0)) {
			user_CacheModel.homePhone = null;
		}

		user_CacheModel.mobilePhone = getMobilePhone();

		String mobilePhone = user_CacheModel.mobilePhone;

		if ((mobilePhone != null) && (mobilePhone.length() == 0)) {
			user_CacheModel.mobilePhone = null;
		}

		user_CacheModel.address1 = getAddress1();

		String address1 = user_CacheModel.address1;

		if ((address1 != null) && (address1.length() == 0)) {
			user_CacheModel.address1 = null;
		}

		user_CacheModel.address2 = getAddress2();

		String address2 = user_CacheModel.address2;

		if ((address2 != null) && (address2.length() == 0)) {
			user_CacheModel.address2 = null;
		}

		user_CacheModel.city = getCity();

		String city = user_CacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			user_CacheModel.city = null;
		}

		user_CacheModel.state = getState();

		String state = user_CacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			user_CacheModel.state = null;
		}

		user_CacheModel.zipCode = getZipCode();

		String zipCode = user_CacheModel.zipCode;

		if ((zipCode != null) && (zipCode.length() == 0)) {
			user_CacheModel.zipCode = null;
		}

		user_CacheModel.securityQuestion = getSecurityQuestion();

		String securityQuestion = user_CacheModel.securityQuestion;

		if ((securityQuestion != null) && (securityQuestion.length() == 0)) {
			user_CacheModel.securityQuestion = null;
		}

		user_CacheModel.answer = getAnswer();

		String answer = user_CacheModel.answer;

		if ((answer != null) && (answer.length() == 0)) {
			user_CacheModel.answer = null;
		}

		user_CacheModel.termsOfUse = isTermsOfUse();

		return user_CacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<User_, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<User_, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<User_, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((User_)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<User_, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<User_, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<User_, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((User_)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, User_>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _userId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private String _userName;
	private String _originalUserName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _firstName;
	private String _lastName;
	private String _emailAddress;
	private boolean _male;
	private Date _birthDay;
	private String _password;
	private String _confirmPassword;
	private String _homePhone;
	private String _mobilePhone;
	private String _address1;
	private String _address2;
	private String _city;
	private String _state;
	private String _zipCode;
	private String _securityQuestion;
	private String _answer;
	private boolean _termsOfUse;
	private long _columnBitmask;
	private User_ _escapedModel;

}