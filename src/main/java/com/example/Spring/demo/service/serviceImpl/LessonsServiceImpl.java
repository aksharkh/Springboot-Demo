package com.example.Spring.demo.service.serviceImpl;


import com.example.Spring.demo.dto.LessonsDto;
import com.example.Spring.demo.entity.Lessons;
import com.example.Spring.demo.exceptions.NotFound;
import com.example.Spring.demo.repository.LessonsRepository;
import com.example.Spring.demo.service.service.LessonsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LessonsServiceImpl implements LessonsService {
    private final LessonsRepository lessonsRepository;
    private final ModelMapper modelMapper;

    @Override
    public LessonsDto getLessons(Long id){
        Lessons lessons = lessonsRepository.findById(id).orElseThrow(() -> new NotFound("id not found"+id));
        return  modelMapper.map(lessons,LessonsDto.class);
    }

    @Override
    public LessonsDto createLesson( LessonsDto lessonDto){
        Lessons lesson= modelMapper.map(lessonDto, Lessons.class);
        Lessons createdLesson= lessonsRepository.save(lesson);
        return modelMapper.map(createdLesson, LessonsDto.class);


    }

}
