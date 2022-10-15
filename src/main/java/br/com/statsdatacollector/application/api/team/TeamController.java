package br.com.statsdatacollector.application.api.team;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team")
public class TeamController {
    private TeamMapper teamMapper;

    public TeamController(TeamMapper teamMapper) {
        this.teamMapper = teamMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamResponse> getTeam(@PathVariable String id) {
        return ResponseEntity.ok(teamMapper.toTeamResponse(id));
    }

}
