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

package com.liferay.training.registration.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.registration.model.User_;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for User_. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see User_LocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface User_LocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link User_LocalServiceUtil} to access the user_ local service. Add custom service methods to <code>com.liferay.training.registration.service.impl.User_LocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public User_ addUser_(
			String userName, String firstName, String lastName,
			String emailAddress, boolean male, Date birthDay, String password,
			String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, String securityQuestion, String answer,
			boolean termsOfUse, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the user_ to the database. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public User_ addUser_(User_ user_);

	public int countUsersByZipCode(String zipCode);

	/**
	 * Creates a new user_ with the primary key. Does not add the user_ to the database.
	 *
	 * @param userId the primary key for the new user_
	 * @return the new user_
	 */
	@Transactional(enabled = false)
	public User_ createUser_(long userId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the user_ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_ that was removed
	 * @throws PortalException if a user_ with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public User_ deleteUser_(long userId) throws PortalException;

	/**
	 * Deletes the user_ from the database. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public User_ deleteUser_(User_ user_);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.registration.model.impl.User_ModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.registration.model.impl.User_ModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User_ fetchUser_(long userId);

	/**
	 * Returns the user_ matching the UUID and group.
	 *
	 * @param uuid the user_'s UUID
	 * @param groupId the primary key of the group
	 * @return the matching user_, or <code>null</code> if a matching user_ could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User_ fetchUser_ByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the user_ with the primary key.
	 *
	 * @param userId the primary key of the user_
	 * @return the user_
	 * @throws PortalException if a user_ with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User_ getUser_(long userId) throws PortalException;

	/**
	 * Returns the user_ matching the UUID and group.
	 *
	 * @param uuid the user_'s UUID
	 * @param groupId the primary key of the group
	 * @return the matching user_
	 * @throws PortalException if a matching user_ could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User_ getUser_ByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the user_s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.registration.model.impl.User_ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @return the range of user_s
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User_> getUser_s(int start, int end);

	/**
	 * Returns all the user_s matching the UUID and company.
	 *
	 * @param uuid the UUID of the user_s
	 * @param companyId the primary key of the company
	 * @return the matching user_s, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User_> getUser_sByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of user_s matching the UUID and company.
	 *
	 * @param uuid the UUID of the user_s
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of user_s
	 * @param end the upper bound of the range of user_s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching user_s, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User_> getUser_sByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<User_> orderByComparator);

	/**
	 * Returns the number of user_s.
	 *
	 * @return the number of user_s
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getUser_sCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User_> getUsersByUserName(String userName);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User_> getUsersByZipCode(String zipCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User_> getUsersByZipCode(String zipCode, int start, int end);

	public User_ updateUser_(
			long userId, String userName, String firstName, String lastName,
			String emailAddress, boolean male, Date birthDay, String password,
			String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, String securityQuestion, String answer,
			boolean termsOfUse, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the user_ in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param user_ the user_
	 * @return the user_ that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public User_ updateUser_(User_ user_);

}