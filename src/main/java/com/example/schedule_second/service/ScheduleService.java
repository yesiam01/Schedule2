package com.example.schedule_second.service;

import com.example.schedule_second.entity.Schedule;
import com.example.schedule_second.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    // 생성
    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    // 전체 조회
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    // 일정 조회
    public Optional<Schedule> getScheduleById(Long id) {
        return scheduleRepository.findById(id);
    }

    // 수정
    public Schedule updateSchedule(Long id, Schedule newSchedule) {
        return scheduleRepository.findById(id)
                .map(schedule -> {
                    // username 필드는 더 이상 없으므로 제거
                    // schedule.setUsername(newSchedule.getUsername());

                    schedule.setTitle(newSchedule.getTitle());
                    schedule.setTodo(newSchedule.getTodo());

                    // user가 새로 전달되었다면 갱신
                    if (newSchedule.getUser() != null) {
                        schedule.setUser(newSchedule.getUser());
                    }

                    return scheduleRepository.save(schedule);
                })
                .orElseThrow(() -> new RuntimeException("Schedule not found " + id));
    }

    // 삭제
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
