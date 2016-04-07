package test;

import java.sql.SQLException;
import java.util.List;

import dao.PersonDao;
import entity.Person;

public class Test_1 {

	public static void main(String[] args) throws SQLException {
		PersonDao dao=new PersonDao();
	//	dao.add(new Person("生命一号",2,"补充大脑营养"));
//		dao.add(new Person("生命一号",3,"提高记忆力"));
//		dao.add(new Person("生命一号",4,"喝酒"));
		Long count= dao.personCount();
		System.out.println(count);
       List<Person> person=dao.findAll();
      for (Person person1 : person) {
    	   System.out.println(person1.toString());
	}
       //System.out.println(""+person.size()); 
		//Person person1=dao.findById(1);
		//dao.update(new Person(1,"生命2号",2,"Dbtuils"));
		//dao.delete(2);
       
        
	}

}



