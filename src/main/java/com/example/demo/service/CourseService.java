package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.modal.dto.CourseDto;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Component
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAllCourses(){

        return courseRepository.findAllClasses();
    }

    public List<Course> searchByCourseName(String input){

        return courseRepository.findCourseByName(input);
    }

    public List<CourseDto> findAllCourses1(){
        return courseRepository.findAllClasses1();
    }

    public List<Integer> getTwoSum(String input){
        List<Integer> nums = courseRepository.getAllNums();
        int target = Integer.parseInt(input);
        HashMap<Integer,Integer> store = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){
            if(store.containsKey(target-nums.get(i))){
                ans.add(i);
                ans.add(store.get(target-nums.get(i)));
                return ans;
            }
            store.put(nums.get(i),i);
        }
        return ans;
    }

}
