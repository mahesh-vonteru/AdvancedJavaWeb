package com.learning.taglibs;

import org.apache.taglibs.standard.tag.el.fmt.MessageTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

public class MyMessage extends BodyTagSupport {

    @Override
    public int doEndTag() throws JspException {

        try {
            JspWriter writer = pageContext.getOut();
            writer.print("Hai... Came from JSTL");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 9;
    }
}
