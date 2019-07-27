package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import jni.chowen.com.patternapplication.component_pattern.Component;

/**
 * Created by zhouwen on 2019/7/27 15:02
 */
public class GzSubCompany extends Company {
    private List<Company> companies = new ArrayList<>();

    @Override
    public void showHierarchy() {
        Logger.getLogger("GzSubCompany").info("GzSubCompany#name=" + mName);
        for (Company company :
                companies) {
            company.showHierarchy();
        }

    }

    public GzSubCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        if (companies.contains(company)) {
            companies.add(company);
        }
    }

    @Override
    public void remove(Company company) {
        if (companies.contains(company))
            companies.remove(company);
    }
}
