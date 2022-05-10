package com.course.repository;

import com.course.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITrainerRepository  extends JpaRepository<Trainer,Integer> {

    List<Trainer> findByTrainerNameContaining(String name);
    @Query("from Trainer t inner join t.courses c where c.courseName like ?1")
    List<Trainer> findByCourseName(String name);
    @Query("from Trainer t inner join t.courses c where t.trainerName=?1")
    Trainer findTrainerDetails(String trainerName);
    @Query("from Trainer t where t.techStack=?1")
    List<Trainer> findByTechStack(String techstack);
    @Query("from Trainer t inner join t.courses c where c.category=?1 and t.ratings=?2")
    List<Trainer> findByTrainerRatings(String category,double ratings);
    @Query("from Trainer t inner join t.courses c where c.category=?1 and t.experience=?2")
    List<Trainer> findByTrainerExperience(String category,int experience);
    @Query("from Trainer t inner join t.courses c where c.courseName=?1 and c.fees=?2")
    List<Trainer> findByCourseNamePrice(String course,double fees);
    @Query("from Trainer t inner join t.courses c where c.courseName=?1 and c.durationInDays=?2")
    List<Trainer> findByNameDuratio(String courseName, int duration);
  @Query("from Trainer t where t.joiningDate<?1")
    List<Trainer> findByJoiningBefore(LocalDate before);
}
