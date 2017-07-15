package com.yc.spring.springtest;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.bean.Apple;
import com.yc.bean.CollectionBean;
import com.yc.bean.ConstructorDi;
import com.yc.bean.InnerBean;
import com.yc.bean.MyProperties;
import com.yc.bean.Pear;
import com.yc.bean.Person;
import com.yc.bean.Student;
import com.yc.biz.StudentBiz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	//再从容器中随机取出bean
    	Student student = (Student) context.getBean("student");
    	student.setId(1);
    	student.setName("张三");
        System.out.println(student);
        
        
        Student s2 = (Student) context.getBean("student");
        //spring默认情况下创建的 是单例，与servlet一样
        System.out.println(student+"\t"+s2);
        System.out.println(student.hashCode()+"\t"+s2.hashCode());
    }
    
    
    public void testApp2()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	//再从容器中随机取出bean
    	Student student = (Student) context.getBean("student");
    	student.setId(1);
    	student.setName("张三");
    	StudentBiz sb = (StudentBiz) context.getBean("studentBiz");
    	sb.addStudent(student);
    }
    
    public void testApp3()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	com.yc.bean.Container c=(com.yc.bean.Container) context.getBean("container");
		
		Person p1=new Person( "张三", 1.70, 800);		//无效
		Person p2=new Person( "李四", 1.70, 600);     //bmi最小
		Person p3=new Person( "王五", 1.60, 900);     // bmi值大
		Person p4=new Person( "赵六", 0.06, 200); 
		Person p5=new Person( "田七", 1.65, 100); 
		Person p6=new Person( "王八", 1.67, 190); 
		
		c.save(   p1 );
		c.save(p2);
		c.save(  p3);
		c.save(p4);
		c.save(p5);
		c.save(p6);
		
		Person max=(Person)c.getMax();   //取最大值
		Person min=(Person)c.getMin();   //最最小值
		
		System.out.println("最大值:"+  max.getName() );
		System.out.println("最小值:"+ min.getName());
		
		System.out.println("平均bmi:"+ c.getAvg() );
		
		Object[] objs=c.getObjs();
		for(   Object o: objs ){
			 Person pp=(Person)o;
			 System.out.println(pp.getName()+"\t"+pp.getHeight()+"\t"+pp.getWeight()+"\t");
		}
    }
    
    
    public void testApp4()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    }
    
    public void testApp5()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	MyProperties mp = (MyProperties) context.getBean("mp");
    	System.out.println(mp);
    }
    
    public void testApp6()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	Apple apple = (Apple) context.getBean("apple");
    	System.out.println(apple.getId());
    }
    
    
    public void testApp7()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	ConstructorDi mp = (ConstructorDi) context.getBean("cd");
    	System.out.println(mp);
    }
    
    
    public void testApp8()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	BasicDataSource mp = (BasicDataSource) context.getBean("myDataSource");
    	try {
			System.out.println(mp.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    
    public void testApp9()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	InnerBean mp = (InnerBean) context.getBean("innerBean");
			System.out.println(mp );
    }
    
    
    public void testApp10()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	CollectionBean mp = (CollectionBean) context.getBean("collectionBean");
			System.out.println(mp );
    }
    
    public void testApp11()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过反射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	ConstructorDi mp = (ConstructorDi) context.getBean("cd2");
    	System.out.println(mp);
    }
    
    public void testApp12()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	ConstructorDi cd2 =  (ConstructorDi) context.getBean("cd2");
    	cd2 =  (ConstructorDi) context.getBean("cd2");
    	
    }
    
    public void testApp13()
    {
    	//实例化容器,spring在自己创建时，就读取beas.xml，并通过射机制创建了对象
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
//    	Pear p1 = (Pear) context.getBean("pear");
//    	Pear p2 = (Pear) context.getBean("pear");
//    	System.out.println(p1.hashCode()+"\t"+p2.hashCode());
//    	context.getBean("pear");
    	
    }
}
