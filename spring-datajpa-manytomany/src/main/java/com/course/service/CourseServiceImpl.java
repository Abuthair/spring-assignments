package com.course.service;

import com.course.model.Course;
import com.course.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements  ICourseService{
    @Autowired
    ICourseRepository iCourseRepository;
    @Override
    public void addCourse(Course course) {
        iCourseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
     iCourseRepository.save(course);
    }

    @Override
    public void deleteCourse(int courseId) {
   iCourseRepository.deleteById(courseId);
    }

    @Override
    public Course getById(int courseId) {
        return iCourseRepository.findById(courseId).get();
    }

    @Override
    public List<Course> getAll() {
        return iCourseRepository.findAll();
    }

    @Override
    public List<Course> getByCategory(String category) {
        return iCourseRepository.findByCategory(category);
    }

    @Override
    public List<Course> getByNameContaining(String name) {
        return iCourseRepository.findByCourseNameContaining(name);
    }

    @Override
    public List<Course> getByNameAndFees(String name, double fees) {
        return iCourseRepository.findByNameAndFees(name, fees);
    }

    @Override
    public List<Course> getByTrainer(String trainerName) {
        return iCourseRepository.findByTrainer(trainerName);
    }

    @Override
    public List<Course> getByTrainerExpertise(String trainerName, String techStack) {
        return iCourseRepository.findByTrainerExpertise(trainerName,techStack);
    }

    @Override
    public List<Course> getByTrainerRatings(String trainerName, double ratings) {
        return iCourseRepository.findByTrainerRatings(trainerName, ratings);
    }

    @Override
    public List<Course> getByTrainerExperience(String trainerName, int experience) {
        return iCourseRepository.findByTrainerExperience(trainerName, experience);
    }

    @Override
    public List<Course> getByTrainerCourseName(String trainerName, String courseName) {
        return iCourseRepository.findByTrainerCourseName(trainerName,"%"+courseName+"%");
    }

    @Override
    public List<Course> getByNameDuration(String name, int duration) {
        return iCourseRepository.findByNameDuration("%"+name+"%",duration);
    }
}
