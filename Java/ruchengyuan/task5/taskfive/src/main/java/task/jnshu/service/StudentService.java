package task.jnshu.service;import task.jnshu.model.Student;import java.util.List;/** * Created by Administrator on 7/8/2017. */public interface StudentService {     Student studentSelect(int id);     int selectStudentNumber(Integer status);     List<Student> studentAll();     Student selectUser(String user);     int selectUserNumber(String user);     int insertSelective(Student record);}