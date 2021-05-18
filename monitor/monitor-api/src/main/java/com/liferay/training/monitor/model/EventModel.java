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

package com.liferay.training.monitor.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Event service. Represents a row in the &quot;Monitor_Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.training.monitor.model.impl.EventModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.training.monitor.model.impl.EventImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Event
 * @generated
 */
@ProviderType
public interface EventModel extends BaseModel<Event>, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a event model instance should use the {@link Event} interface instead.
	 */

	/**
	 * Returns the primary key of this event.
	 *
	 * @return the primary key of this event
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this event.
	 *
	 * @param primaryKey the primary key of this event
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this event.
	 *
	 * @return the uuid of this event
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this event.
	 *
	 * @param uuid the uuid of this event
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the event ID of this event.
	 *
	 * @return the event ID of this event
	 */
	public long getEventId();

	/**
	 * Sets the event ID of this event.
	 *
	 * @param eventId the event ID of this event
	 */
	public void setEventId(long eventId);

	/**
	 * Returns the company ID of this event.
	 *
	 * @return the company ID of this event
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this event.
	 *
	 * @param companyId the company ID of this event
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user name of this event.
	 *
	 * @return the user name of this event
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this event.
	 *
	 * @param userName the user name of this event
	 */
	public void setUserName(String userName);

	/**
	 * Returns the user ID of this event.
	 *
	 * @return the user ID of this event
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this event.
	 *
	 * @param userId the user ID of this event
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this event.
	 *
	 * @return the user uuid of this event
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this event.
	 *
	 * @param userUuid the user uuid of this event
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the event date of this event.
	 *
	 * @return the event date of this event
	 */
	public Date getEventDate();

	/**
	 * Sets the event date of this event.
	 *
	 * @param eventDate the event date of this event
	 */
	public void setEventDate(Date eventDate);

	/**
	 * Returns the event type of this event.
	 *
	 * @return the event type of this event
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this event.
	 *
	 * @param eventType the event type of this event
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the ip address of this event.
	 *
	 * @return the ip address of this event
	 */
	@AutoEscape
	public String getIpAddress();

	/**
	 * Sets the ip address of this event.
	 *
	 * @param ipAddress the ip address of this event
	 */
	public void setIpAddress(String ipAddress);

}