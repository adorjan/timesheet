package com.liferay.timesheet.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.timesheet.model.Task;
import com.liferay.timesheet.service.TaskLocalServiceUtil;

/**
 * The extended model base implementation for the Task service. Represents a row in the &quot;timesheet_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaskImpl}.
 * </p>
 *
 * @author Adorjan
 * @see TaskImpl
 * @see com.liferay.timesheet.model.Task
 * @generated
 */
public abstract class TaskBaseImpl extends TaskModelImpl implements Task {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a task model instance should use the {@link Task} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            TaskLocalServiceUtil.addTask(this);
        } else {
            TaskLocalServiceUtil.updateTask(this);
        }
    }
}
