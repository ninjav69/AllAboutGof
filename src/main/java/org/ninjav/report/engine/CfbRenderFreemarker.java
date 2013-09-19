package org.ninjav.report.engine;

public class CfbRenderFreemarker implements CfbRenderBehavior {

    /**
     *
     * @param report
     */
    @Override
    public void render(CfbReport report) {
        report.setRenderBuffer("Rendering CFB via Freemarker");
    }
}