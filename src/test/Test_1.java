package test;

import java.sql.SQLException;
import java.util.List;

import dao.PersonDao;
import entity.Person;

public class Test_1 {

	public static void main(String[] args) throws SQLException {
		PersonDao dao=new PersonDao();
	//	dao.add(new Person("����һ��",2,"�������Ӫ��"));
//		dao.add(new Person("����һ��",3,"��߼�����"));
//		dao.add(new Person("����һ��",4,"�Ⱦ�"));
		Long count= dao.personCount();
		System.out.println(count);
       List<Person> person=dao.findAll();
      for (Person person1 : person) {
    	   System.out.println(person1.toString());
	}
       //System.out.println(""+person.size()); 
		//Person person1=dao.findById(1);
		//dao.update(new Person(1,"����2��",2,"Dbtuils"));
		//dao.delete(2);
       
        
	}

}



