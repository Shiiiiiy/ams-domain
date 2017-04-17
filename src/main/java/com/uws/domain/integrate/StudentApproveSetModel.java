package com.uws.domain.integrate;

import com.uws.core.base.BaseModel;
import com.uws.domain.base.BaseClassModel;
import com.uws.domain.orientation.StudentInfoModel;
import com.uws.sys.model.Dic;

/**
 * 
 * @ClassName: StudentApproveSetModel 
 * @Description: (学生审核设置信息实体类) 
 * @author wangjr
 * @date 2015-7-30 上午10:33:35 
 *
 */
public class StudentApproveSetModel extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 实体类id
	 */
	private String id;
	/**
	 * 实体类班级编号
	 */
	private BaseClassModel classId;
	/**
	 * 设置学生编号
	 */
	private StudentInfoModel studentId;
	/**
	 * 实体类审核状态
	 */
	private Dic status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BaseClassModel getClassId() {
		return classId;
	}
	public void setClassId(BaseClassModel classId) {
		this.classId = classId;
	}
	public StudentInfoModel getStudentId() {
		return studentId;
	}
	public void setStudentId(StudentInfoModel studentId) {
		this.studentId = studentId;
	}
	public Dic getStatus() {
		return status;
	}
	public void setStatus(Dic status) {
		this.status = status;
	}
	
}
