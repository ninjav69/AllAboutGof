package org.ninjav.report.engine;

public class CfbDeliverMail implements CfbDeliverBehavior {

    /**
     *
     * @param report
     */
    @Override
    public void deliver(CfbReport report) {
        System.out.println("Deliver via email: " + report.getRenderBuffer());
    }
}