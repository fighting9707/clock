package com.gduf.clock.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "speech_info")
@Data
public class SpeechInfo {
    @Id
    private String id;

    @Column(name = "open_id")
    private String openId;

    @Column(name = "daily_map")
    private String dailyMap;

    @Column(name = "speech_path")
    private String speechPath;

    private Date time;


}