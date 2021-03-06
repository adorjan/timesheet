package com.liferay.timesheet.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the task local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Adorjan
 * @see TaskLocalServiceUtil
 * @see com.liferay.timesheet.service.base.TaskLocalServiceBaseImpl
 * @see com.liferay.timesheet.service.impl.TaskLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface TaskLocalService extends BaseLocalService, InvokableLocalService,
    PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TaskLocalServiceUtil} to access the task local service. Add custom service methods to {@link com.liferay.timesheet.service.impl.TaskLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the task to the database. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @return the task that was added
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task addTask(
        com.liferay.timesheet.model.Task task)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new task with the primary key. Does not add the task to the database.
    *
    * @param taskId the primary key for the new task
    * @return the new task
    */
    public com.liferay.timesheet.model.Task createTask(long taskId);

    /**
    * Deletes the task with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param taskId the primary key of the task
    * @return the task that was removed
    * @throws PortalException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task deleteTask(long taskId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the task from the database. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @return the task that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task deleteTask(
        com.liferay.timesheet.model.Task task)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.timesheet.model.Task fetchTask(long taskId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the task with the primary key.
    *
    * @param taskId the primary key of the task
    * @return the task
    * @throws PortalException if a task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.timesheet.model.Task getTask(long taskId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tasks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of tasks
    * @param end the upper bound of the range of tasks (not inclusive)
    * @return the range of tasks
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.timesheet.model.Task> getTasks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tasks.
    *
    * @return the number of tasks
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getTasksCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @return the task that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task updateTask(
        com.liferay.timesheet.model.Task task)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param task the task
    * @param merge whether to merge the task with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the task that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.timesheet.model.Task updateTask(
        com.liferay.timesheet.model.Task task, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public com.liferay.timesheet.model.Task addTask(long companyId,
        long userId, java.util.Date startDate, java.util.Date endDate,
        java.lang.String taskName)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.timesheet.model.Task> getTasks(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;
}
