package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {
    @NotBlank
    private String name;
    @Max(value=90)
    private int age;
//    @Email
//    private String email;
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message="핸드폰 번호의 양식과 맞지 않습니다.")
//    private String phoneNumber;
//
//    @YearMonth
//    private String reqYearMonth;
    @Valid
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    //    이런 경우에 다른곳에서 날짜를 request 받는곳이 있다면 이렇게 모든 곳에서 다 똑같이 만들어줘야된다.
//    중복 코드를 없애기 위해서 annotation을 만들어준다.
//    @AssertTrue(message = "YYYYMM 형식에 맞지 않습니다.")
//    public boolean isReqMonthValidation() {
//        try {
//            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
