package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 15:18
 */
public class BJ总公司 extends Company{
    private List<Company> companies = new ArrayList<>();
    @Override
    public void showHierarchy() {
        Logger.getLogger("BJ总公司").info("BJ总公司#name=" + mName);
        for (Company company:
                companies) {
            company.showHierarchy();
        }

    }

    public BJ总公司(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        if (companies.contains(company)){
            companies.add(company);
        }
    }

    @Override
    public void remove(Company company) {
        if (companies.contains(company))
            companies.remove(company);
    }

}
