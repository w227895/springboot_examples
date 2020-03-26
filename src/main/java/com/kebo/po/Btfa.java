package com.kebo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

/**
 * @program: hmbtdz
 * @description:
 * @author: kb
 * @create: 2020-03-20 15:56
 **/
@Entity
@Table(name = "btfa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Btfa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer btfaId;

    private String btfaName;

    private String btfaYear;

    private Date btfaStart;

    private Date btfaEnd;

    private String btfaDescribe;

    private String btfaType;

    private String btfaMethods;

    private String btfaDiscount;

    private String btfaCalculation;
}
