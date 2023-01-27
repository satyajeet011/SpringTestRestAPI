package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceimpl implements CourseService{
	List<Course> list;
	public CourseServiceimpl() {
		
	}
	 
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		list.add(new Course(145,"Java course", "basic of java", 2999, "navin"));
		list.add(new Course(233,"spring", "create rest api", 1999, "rahul"));
		list.add(new Course(541,"python", "learn python with data science", 2999, "Rao"));
		list.add(new Course(265,"ai with ml", "learn about AI and ML", 5999, "Vikas"));
		return list;
	}
	 
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
			return c;
		}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
