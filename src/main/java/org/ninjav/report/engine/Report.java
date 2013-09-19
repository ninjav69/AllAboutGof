package org.ninjav.report.engine;

public abstract class Report {

    // All reports are driven by this process. It never changes.
    public void process() {
        init();
        fill();
        render();
        deliver();
    }

    // Each report can handle this in a special way. This is the thing
    // that changes in a report - especially fill, render and deliver.
    // We may want to render to html, pdf, text etc.
    // We may want to deliver to a memory buffer, servlet stream, gui display, email etc.
    protected abstract void init();

    protected abstract void fill();

    protected abstract void render();

    protected abstract void deliver();
}