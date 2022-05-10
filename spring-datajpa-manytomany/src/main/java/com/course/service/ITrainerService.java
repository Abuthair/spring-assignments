package com.course.service;

import com.course.model.Trainer;

import java.time.LocalDate;
import java.util.List;

public interface ITrainerService {
    void addTrainer(Trainer trainer);
    void updateTrainer(Trainer trainer);
    void deleteTrainer(int trainerId);
    Trainer getById(int trainerId);
    List<Trainer> getAll();

    List<Trainer> getByTrainerName(String name);
    List<Trainer> getByCourseName(String name);
    Trainer getTrainerDetails(String trainerName);
    List<Trainer> getByTechStack(String techstack);
    List<Trainer> getByTrainerRatings(String category,double ratings);
    List<Trainer> getByTrainerExperience(String category,int experience);
    List<Trainer> getByCourseNamePrice(String course,double fees);
    List<Trainer> getByNameDuratio(String courseName, int duration);
    List<Trainer> getByJoiningBefore(LocalDate before);
}
