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

package com.liferay.training.monitor.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.monitor.model.Event;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Event. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EventServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface EventService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EventServiceUtil} to access the event remote service. Add custom service methods to <code>com.liferay.training.monitor.service.impl.EventServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Event addEvent(
			long userId, String userName, Date eventDate, String eventType,
			String ipAddress, ServiceContext serviceContext)
		throws PortalException;

	public int countEventsByEventType(String eventType);

	public int countEventsByEventTypeAndUserId(String eventType, long userId);

	public int countEventsByGroupId(long groupId);

	public int countEventsByUserId(long userId);

	public Event deleteEvent(long eventId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getAllEvents();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getAllEvents(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getAllEvents(
		int start, int end, OrderByComparator<Event> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getAllEvents(
		long groupId, int start, int end,
		OrderByComparator<Event> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getAllEventsByUserId(
		long userId, int start, int end,
		OrderByComparator<Event> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Event getEvent(long eventId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getEventsByCompanyId(long companyId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getEventsByEventType(String eventType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getEventsByEventType(
		String eventType, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getEventsByEventType(
		String eventType, int start, int end,
		OrderByComparator<Event> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Event> getEventsByEventTypeAndUserId(
		long userId, String eventType, int start, int end,
		OrderByComparator<Event> orderByComparator);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public Event updateEvent_(
			long eventId, long userId, String userName, Date eventDate,
			String eventType, String ipAddress, ServiceContext serviceContext)
		throws PortalException;

}