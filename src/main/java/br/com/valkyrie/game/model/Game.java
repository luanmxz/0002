package br.com.valkyrie.game.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb0002_game")
public class Game {
    
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="a0002_game_id")
private Long id;

//private Tournament tournament? -- which tournament owns this game?

private String team_one;
private String team_two;
//private String winner; decided by the winner of most maps. do business logic

//private Long roundsTeamOne; these objects goes into Map class.
//private Long roundsTeamTwo;
@Column(name = "a0002_numberOfMaps")
private Long numberOfMaps;

@Column(name = "a0002_game_odd")
private Double odd;

@Column(name = "a0002_isFinished", insertable = false, columnDefinition = "default false")
private boolean isFinished;
@Column(name = "a0002_isCanceled", insertable = false, columnDefinition = "default false")
private boolean isCanceled;
@Column(name = "a0002_isOpenToBet", insertable = false, columnDefinition = "default false")
private boolean isOpenToBet;

@Column(name = "a0002_createdAt", insertable = false, updatable = false, columnDefinition = "timestamp default NOW()")
private Date createdAt;
@Column(name = "a0002_initialDate")
private Date initialDate;
@Column(name = "a0002_finalDate")
private Date finalDate;

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getTeam_one() {
    return team_one;
}
public void setTeam_one(String team_one) {
    this.team_one = team_one;
}
public String getTeam_two() {
    return team_two;
}
public void setTeam_two(String team_two) {
    this.team_two = team_two;
}
public Long getNumberOfMaps() {
    return numberOfMaps;
}
public void setNumberOfMaps(Long numberOfMaps) {
    this.numberOfMaps = numberOfMaps;
}
public Double getOdd() {
    return odd;
}
public void setOdd(Double odd) {
    this.odd = odd;
}
public boolean isFinished() {
    return isFinished;
}
public void setFinished(boolean isFinished) {
    this.isFinished = isFinished;
}
public boolean isCanceled() {
    return isCanceled;
}
public void setCanceled(boolean isCanceled) {
    this.isCanceled = isCanceled;
}
public Date getInitialDate() {
    return initialDate;
}
public void setInitialDate(Date initialDate) {
    this.initialDate = initialDate;
}
public Date getFinalDate() {
    return finalDate;
}
public void setFinalDate(Date finalDate) {
    this.finalDate = finalDate;
}
public boolean isOpenToBet() {
    return isOpenToBet;
}
public void setOpenToBet(boolean isOpenToBet) {
    this.isOpenToBet = isOpenToBet;
}


}
