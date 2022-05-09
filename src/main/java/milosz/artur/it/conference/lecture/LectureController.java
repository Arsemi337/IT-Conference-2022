package milosz.artur.it.conference.lecture;

import milosz.artur.it.conference.models.ConferenceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LectureController {
    private final LectureService lectureService;

    LectureController(LectureService lectureService)
    {
        this.lectureService = lectureService;
    }

    @GetMapping("/lectures/conferenceInfo")
    ConferenceResponse conferenceInfo()
    {
        return lectureService.conferencePlan();
    }

    @GetMapping("/lectures/allByUserLogin{login}")
    List<Lecture> getByUserLogin(@PathVariable String login)
    {
        return lectureService.getLecturesOfUserByLogin(login);
    }
}
