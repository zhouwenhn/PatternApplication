package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 15:16
 */
public class Client {
    public void test(){

        Company root = new BJ总公司("BJ总公司");
        Company company = new BjSubCompany("北京分公司");
        Company company2 = new BjSubCompany("广州分公司");
        Company company3 = new BjSubCompany("ForeignBranchOffice");

        root.add(company);
        root.add(company2);
        root.add(company3);

        company.add(new Admin行政("北京行政"));
        company.add(new HR人力("北京HR人力"));
        company.add(new Finance财务("北京财务"));

        company2.add(new HR人力("广州HR人力"));
        company2.add(new RD研发("广州研发"));

        Logger.getLogger("Client").info("公司层级：");
        root.showHierarchy();
    }
}
