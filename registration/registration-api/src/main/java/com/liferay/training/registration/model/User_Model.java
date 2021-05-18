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

package com.liferay.training.registration.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the User_ service. Represents a row in the &quot;Registration_User_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.training.registration.model.impl.User_ModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.training.registration.model.impl.User_Impl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User_
 * @generated
 */
@ProviderType
public interface User_Model
	extends BaseModel<User_>, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user_ model instance should use the {@link User_} interface instead.
	 */

	/**
	 * Returns the primary key of this user_.
	 *
	 * @return the primary key of this user_
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user_.
	 *
	 * @param primaryKey the primary key of this user_
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this user_.
	 *
	 * @return the uuid of this user_
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this user_.
	 *
	 * @param uuid the uuid of this user_
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the user ID of this user_.
	 *
	 * @return the user ID of this user_
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this user_.
	 *
	 * @param userId the user ID of this user_
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user_.
	 *
	 * @return the user uuid of this user_
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user_.
	 *
	 * @param userUuid the user uuid of this user_
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the company ID of this user_.
	 *
	 * @return the company ID of this user_
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user_.
	 *
	 * @param companyId the company ID of this user_
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user name of this user_.
	 *
	 * @return the user name of this user_
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this user_.
	 *
	 * @param userName the user name of this user_
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this user_.
	 *
	 * @return the create date of this user_
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user_.
	 *
	 * @param createDate the create date of this user_
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user_.
	 *
	 * @return the modified date of this user_
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user_.
	 *
	 * @param modifiedDate the modified date of this user_
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the first name of this user_.
	 *
	 * @return the first name of this user_
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this user_.
	 *
	 * @param firstName the first name of this user_
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this user_.
	 *
	 * @return the last name of this user_
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this user_.
	 *
	 * @param lastName the last name of this user_
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the email address of this user_.
	 *
	 * @return the email address of this user_
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this user_.
	 *
	 * @param emailAddress the email address of this user_
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the male of this user_.
	 *
	 * @return the male of this user_
	 */
	public boolean getMale();

	/**
	 * Returns <code>true</code> if this user_ is male.
	 *
	 * @return <code>true</code> if this user_ is male; <code>false</code> otherwise
	 */
	public boolean isMale();

	/**
	 * Sets whether this user_ is male.
	 *
	 * @param male the male of this user_
	 */
	public void setMale(boolean male);

	/**
	 * Returns the birth day of this user_.
	 *
	 * @return the birth day of this user_
	 */
	public Date getBirthDay();

	/**
	 * Sets the birth day of this user_.
	 *
	 * @param birthDay the birth day of this user_
	 */
	public void setBirthDay(Date birthDay);

	/**
	 * Returns the password of this user_.
	 *
	 * @return the password of this user_
	 */
	@AutoEscape
	public String getPassword();

	/**
	 * Sets the password of this user_.
	 *
	 * @param password the password of this user_
	 */
	public void setPassword(String password);

	/**
	 * Returns the confirm password of this user_.
	 *
	 * @return the confirm password of this user_
	 */
	@AutoEscape
	public String getConfirmPassword();

	/**
	 * Sets the confirm password of this user_.
	 *
	 * @param confirmPassword the confirm password of this user_
	 */
	public void setConfirmPassword(String confirmPassword);

	/**
	 * Returns the home phone of this user_.
	 *
	 * @return the home phone of this user_
	 */
	@AutoEscape
	public String getHomePhone();

	/**
	 * Sets the home phone of this user_.
	 *
	 * @param homePhone the home phone of this user_
	 */
	public void setHomePhone(String homePhone);

	/**
	 * Returns the mobile phone of this user_.
	 *
	 * @return the mobile phone of this user_
	 */
	@AutoEscape
	public String getMobilePhone();

	/**
	 * Sets the mobile phone of this user_.
	 *
	 * @param mobilePhone the mobile phone of this user_
	 */
	public void setMobilePhone(String mobilePhone);

	/**
	 * Returns the address1 of this user_.
	 *
	 * @return the address1 of this user_
	 */
	@AutoEscape
	public String getAddress1();

	/**
	 * Sets the address1 of this user_.
	 *
	 * @param address1 the address1 of this user_
	 */
	public void setAddress1(String address1);

	/**
	 * Returns the address2 of this user_.
	 *
	 * @return the address2 of this user_
	 */
	@AutoEscape
	public String getAddress2();

	/**
	 * Sets the address2 of this user_.
	 *
	 * @param address2 the address2 of this user_
	 */
	public void setAddress2(String address2);

	/**
	 * Returns the city of this user_.
	 *
	 * @return the city of this user_
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this user_.
	 *
	 * @param city the city of this user_
	 */
	public void setCity(String city);

	/**
	 * Returns the state of this user_.
	 *
	 * @return the state of this user_
	 */
	@AutoEscape
	public String getState();

	/**
	 * Sets the state of this user_.
	 *
	 * @param state the state of this user_
	 */
	public void setState(String state);

	/**
	 * Returns the zip code of this user_.
	 *
	 * @return the zip code of this user_
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this user_.
	 *
	 * @param zipCode the zip code of this user_
	 */
	public void setZipCode(String zipCode);

	/**
	 * Returns the security question of this user_.
	 *
	 * @return the security question of this user_
	 */
	@AutoEscape
	public String getSecurityQuestion();

	/**
	 * Sets the security question of this user_.
	 *
	 * @param securityQuestion the security question of this user_
	 */
	public void setSecurityQuestion(String securityQuestion);

	/**
	 * Returns the answer of this user_.
	 *
	 * @return the answer of this user_
	 */
	@AutoEscape
	public String getAnswer();

	/**
	 * Sets the answer of this user_.
	 *
	 * @param answer the answer of this user_
	 */
	public void setAnswer(String answer);

	/**
	 * Returns the terms of use of this user_.
	 *
	 * @return the terms of use of this user_
	 */
	public boolean getTermsOfUse();

	/**
	 * Returns <code>true</code> if this user_ is terms of use.
	 *
	 * @return <code>true</code> if this user_ is terms of use; <code>false</code> otherwise
	 */
	public boolean isTermsOfUse();

	/**
	 * Sets whether this user_ is terms of use.
	 *
	 * @param termsOfUse the terms of use of this user_
	 */
	public void setTermsOfUse(boolean termsOfUse);

}