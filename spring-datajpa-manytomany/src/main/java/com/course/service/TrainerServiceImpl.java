package com.course.service;

import com.course.model.Trainer;
import com.course.repository.ITrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public class TrainerServiceImpl implements ITrainerService{
    @Autowired
    ITrainerRepository iTrainerRepository;
    @Override
    public void addTrainer(Trainer trainer) {
        iTrainerRepository.save(trainer);

    }

    @Override
    public void updateTrainer(Trainer trainer) {
      iTrainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(int trainerId) {
    iTrainerRepository.deleteById(trainerId);
    }

    @Override
    public Trainer getById(int trainerId) {
        return iTrainerRepository.findById(trainerId).get();
    }

    @Override
    public List<Trainer> getAll() {
        return iTrainerRepository.findAll(Sort.by("trainerName"));
    }

    @Override
    public List<Trainer> getByTrainerName(String name) {
        return iTrainerRepository.findByTrainerNameContaining(name);
    }

    @Override
    public List<Trainer> getByCourseName(String name) {
        return iTrainerRepository.findByCourseName(name);
    }

    @Override
    public Trainer getTrainerDetails(String trainerName) {
        return iTrainerRepository.findTrainerDetails(trainerName);
    }

    @Override
    public List<Trainer> getByTechStack(String techstack) {
        return iTrainerRepository.findByTechStack(techstack);
    }

    @Override
    public List<Trainer> getByTrainerRatings(String category, double ratings) {
        return iTrainerRepository.findByTrainerRatings(category, ratings);
    }

    @Override
    public List<Trainer> getByTrainerExperience(String category, int experience) {
        return iTrainerRepository.findByTrainerExperience(category, experience);
    }

    @Override
    public List<Trainer> getByCourseNamePrice(String course, double fees) {
        return iTrainerRepository.findByCourseNamePrice(course, fees);
    }

    @Override
    public List<Trainer> getByNameDuratio(String courseName, int duration) {
        return iTrainerRepository.findByNameDuratio(courseName, duration);
    }

    @Override
    public List<Trainer> getByJoiningBefore(LocalDate before) {
        return iTrainerRepository.findByJoiningBefore(before);
    }
}
