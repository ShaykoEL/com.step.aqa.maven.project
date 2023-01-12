package com.step.aqa.maven.project.view;

import com.step.aqa.maven.project.dao.models.Department;
import com.step.aqa.maven.project.dao.models.Diseases;
import com.step.aqa.maven.project.service.DepartmentService;
import com.step.aqa.maven.project.service.DiseaseService;
import com.step.aqa.maven.project.service.DoctorService;

import javax.transaction.SystemException;
import java.util.List;

public class MainClass {
    DepartmentService departmentService;
    DoctorService doctorService;
    DiseaseService diseaseService;

    public MainClass() {
        this.departmentService = new DepartmentService();
        this.doctorService = new DoctorService();
        this.diseaseService = new DiseaseService();
    }

    public static void main(String[] args) throws SystemException {
        MainClass m = new MainClass();
        m.showTables();
        m.addDiseases();
        m.showTables();
    }

    public void addDiseases(){
        Diseases diseases = new Diseases();
        diseases.setName("Орви");
        diseases.setSeverity(1);
        diseaseService.saveDisease(diseases);

    }
    public void showTables() throws SystemException {

        List<Department> departments = departmentService.getAllDepartments();

        departments.forEach(department -> System.out.println(department.toString()));

        List<Diseases> diseases = (List<Diseases>) diseaseService.getAllDiseases();

        diseases.forEach(disease -> System.out.println(disease.toString()));

    }
}
