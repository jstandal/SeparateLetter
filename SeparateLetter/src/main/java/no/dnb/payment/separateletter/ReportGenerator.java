package no.dnb.payment.separateletter;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
import no.dnb.payment.separateletter.input.SeparateLetterInput;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReportGenerator {

    public static void main(String[] args) {
        System.out.println("Separate letter");

        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("TestPdf.pdf"));

            SeparateLetterInput sli = new SeparateLetterInput.SLBuilder()
                    .creditorName("TestName")
                    
                    .build();


            document.open();

            Image logo = Image.getInstance("dnb.png");
            logo.scalePercent(10);
            document.add(logo);


            //Add logic to adding the object.
            Phrase creditorInfo = new Phrase(
                    14,
                    new Chunk(
                            "\nCreditor Name\nCreditor Address\nCreditor Country\n",
                            FontFactory.getFont(FontFactory.HELVETICA, 12,
                                    Font.NORMAL)));

            Phrase regards = new Phrase(
                    14,
                    new Chunk(
                            "\nBest regards\nDNB Bank ASA",
                            FontFactory.getFont(FontFactory.HELVETICA, 12,
                                    Font.NORMAL)));

            Phrase questions = new Phrase(
                    14,
                    new Chunk(
                            "\nAny questions related to this transaction should be referred to ##DEBETOR NAME##\n",
                            FontFactory.getFont(FontFactory.HELVETICA, 12,
                                    Font.NORMAL)));



            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate template = cb.createTemplate(500, 200);
            cb.addTemplate(template);


            //Adding all the
            document.add(creditorInfo);
            document.add(questions);
            document.add(regards);





        } catch(DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }

        document.close();

    }
}
