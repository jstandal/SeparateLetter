package no.dnb.payment.separateletter;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.*;
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

            Paragraph s = new Paragraph("Invoice number 124567976676363. Inv\n" +
                    "oice number 124567976676363. Invoic" +
                    "e number 124567976676363. Invoice n" +
                    "umber 124567976676363. Invoice numb" +
                    "er 124567976676363. Invoice number " +
                    "124567976676363. Invoice number 124\n" +
                    "567976676363. Invoice number 124567\n" +
                    "976676363. Invoice number 124567976\n" +
                    "676363. Invoice number 124567976676\n" +
                    "363. Invoice number 124567976676363\n" +
                    ". Invoice number 124567976676363. I\n" +
                    "nvoice number 124567976676363. Invo\n" +
                    "ice number 124567976676363. Invoice\n" +
                    " number 124567976676363. Invoice nu\n" +
                    "mber 124567976676363. Invoice numbe\n" +
                    "r 124567976676363. Invoice number 1\n" +
                    "24567976676363. Invoice number 1245\n" +
                    "67976676363. Invoice number 1245679\n" +
                    "76676363. Invoice number 1245679766\n" +
                    "76363. Invoice number 1245679766763\n" +
                    "63. Invoice number 124567976676363.\n" +
                    " Invoice number 124567976676363. In\n" +
                    "voice number 124567976676363. Invoi\n" +
                    "ce number 124567976676363. Invoice \n" +
                    "number 124567976676363. Invoice num\n" +
                    "ber 124567976676363. Invoice number\n" +
                    " 124567976676363. Invoice number 12\n" +
                    "4567976676363. Invoice number 12456\n" +
                    "7976676363. Invoice number 12456797\n" +
                    "6676363. Invoice number 124567976676363. Inv\n" +
                    "oice number 124567976676363. Invoic\n" +
                    "e number 124567976676363. Invoice n\n" +
                    "umber 124567976676363. Invoice numb\n" +
                    "er 124567976676363. Invoice number \n" +
                    "124567976676363. Invoice number 124\n" +
                    "567976676363. Invoice number 124567\n" +
                    "976676363. Invoice number 124567976\n" +
                    "676363. Invoice number 124567976676\n" +
                    "363. Invoice number 124567976676363\n" +
                    ". Invoice number 124567976676363. I\n" +
                    "nvoice number 124567976676363. Invo\n" +
                    "ice number 124567976676363. Invoice\n" +
                    " number 124567976676363. Invoice nu\n" +
                    "mber 124567976676363. Invoice numbe\n" +
                    "r 124567976676363. Invoice number 1\n" +
                    "24567976676363. Invoice number 1245\n" +
                    "67976676363. Invoice number 1245679\n" +
                    "76676363. Invoice number 1245679766\n" +
                    "76363. Invoice number 1245679766763\n" +
                    "63. Invoice number 124567976676363.\n" +
                    " Invoice number 124567976676363. In\n" +
                    "voice number 124567976676363. Invoi\n" +
                    "ce number 124567976676363. Invoice \n" +
                    "number 124567976676363. Invoice num\n" +
                    "ber 124567976676363. Invoice number\n" +
                    " 124567976676363. Invoice number 12\n" +
                    "4567976676363. Invoice number 12456\n" +
                    "7976676363. Invoice number 12456797\n" +
                    "oice number 124567976676363. Invoic\n" +
                    "e number 124567976676363. Invoice n\n" +
                    "umber 124567976676363. Invoice numb\n" +
                    "er 124567976676363. Invoice number \n" +
                    "124567976676363. Invoice number 124\n" +
                    "567976676363. Invoice number 124567\n" +
                    "976676363. Invoice number 124567976\n" +
                    "676363. Invoice number 124567976676\n" +
                    "363. Invoice number 124567976676363\n" +
                    ". Invoice number 124567976676363. I\n" +
                    "nvoice number 124567976676363. Invo\n" +
                    "ice number 124567976676363. Invoice\n" +
                    " number 124567976676363. Invoice nu\n" +
                    "mber 124567976676363. Invoice numbe\n" +
                    "r 124567976676363. Invoice number 1\n" +
                    "24567976676363. Invoice number 1245\n" +
                    "67976676363. Invoice number 1245679\n" +
                    "76676363. Invoice number 1245679766\n" +
                    "76363. Invoice number 1245679766763\n" +
                    "63. Invoice number 124567976676363.\n" +
                    " Invoice number 124567976676363. In\n" +
                    "voice number 124567976676363. Invoi\n" +
                    "ce number 124567976676363. Invoice \n" +
                    "number 124567976676363. Invoice num\n" +
                    "ber 124567976676363. Invoice number\n" +
                    " 124567976676363. Invoice number 12\n" +
                    "4567976676363. Invoice number 12456\n" +
                    "7976676363. Invoice number 12456797\n" +
                    "6676363. ");

            document.open();

            PdfPTable headerTable = new PdfPTable(new float[] { 5, 3 });
            headerTable.setWidthPercentage(100);
            PdfPCell cell;

            Image logo = Image.getInstance("dnb.png");
            logo.scalePercent(10);
            cell = CreateCell(logo);
            headerTable.addCell(cell);

            cell = CreateCell("");
            headerTable.addCell(cell);

            //Account service ref

            //cell = CreateCell("Our ref.: Account service ref./ 12345678987");
            //headerTable.addCell(cell);

            //Date and page number
            //cell = CreateCell("Oslo, 8. December 2022  "+String.format("Page %d of", writer.getPageNumber()));
            //headerTable.addCell(cell);


            Phrase headerPhrase = new Phrase();
            headerPhrase.add(headerTable);
            HeaderFooter header = new HeaderFooter(headerPhrase, false);
            HeaderFooter footer = new HeaderFooter(new Phrase("This is page "), new Phrase("."));
            document.setHeader(header);
            document.setFooter(footer);

            //Logo setup
            document.add(logo);
            document.add(new Paragraph("\n"));

            //Creating the table
            PdfPTable table = new PdfPTable(new float[] { 5, 3 });
            table.setWidthPercentage(100);

            //Creditor information
            cell = CreateCell("Creditor Name\nCreditor Address\nCreditor Country\n");
            table.addCell(cell);

            //Fixed address
            cell = CreateCell("Kundesenter, BF\nNO 0021 Oslo\nTelephone (+47) 915 04800");
            table.addCell(cell);

            //Account service ref
            cell = CreateCell("Our ref.: Account service ref./ 12345678987");
            table.addCell(cell);

            //Date and page number
            cell = CreateCell("Oslo, 8. December 2022  "+String.format("Page %d of", writer.getPageNumber()));
            table.addCell(cell);

            //On behalf
            cell = CreateCell("On behalf of our customer..........................................:");
            table.addCell(cell);

            //Debtor information
            cell = CreateCell("Debtor Name\nDebtor Address");
            table.addCell(cell);

            //Fixed information
            cell = CreateCell("We hereby send you a list in respect of our transfer:");
            table.addCell(cell);
            cell = CreateCell(""); //Blank cell
            table.addCell(cell);

            //Transfer information
            cell = CreateCell("Date: 8 . December 2022\n" +
                    "Amount: EUR 500.2458.,00\n" +
                    "Bank ref: 123456789");
            table.addCell(cell);
            cell = CreateCell(""); //Blank cell
            table.addCell(cell);

            //Account information
            cell = CreateCell("In favour of your account : DE12345678987456251484");
            table.addCell(cell);

            document.add(table);

            Phrase phrase = new Phrase(
                    10,
                    new Chunk(
                            "Remittance information specifications:",
                            FontFactory.getFont(FontFactory.HELVETICA, 10,
                                    Font.BOLD)));
            document.add(phrase);

            document.add(s);

            //Add logic to adding the object.
            Phrase creditorInfo = new Phrase(
                    14,
                    new Chunk(
                            "",
                            FontFactory.getFont(FontFactory.HELVETICA, 12,
                                    Font.NORMAL)));

            Phrase regards = new Phrase(
                    14,
                    new Chunk(
                            "DNB Bank ASA",
                            FontFactory.getFont(FontFactory.HELVETICA, 12,
                                    Font.NORMAL)));

            Phrase questions = new Phrase(
                    14,
                    new Chunk(
                            "\nAny questions related to this transaction should be referred to ##DEBETOR NAME##\n",
                            FontFactory.getFont(FontFactory.HELVETICA, 12,
                                    Font.NORMAL)));

            //Adding all the

            document.add(creditorInfo);
            document.add(questions);
            document.add(regards);

        } catch(DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }

        document.close();

    }

    private static PdfPCell CreateCell(String info){
        Font f = new Font(Font.HELVETICA, 10, Font.NORMAL);
        Phrase p = new Phrase(12, new Chunk(info,f));
        PdfPCell c = new PdfPCell(p);
        c.setBorderColor(Color.WHITE);
        c.setPaddingBottom(12);
        c.setBorder(0);
        return c;
    }

    private static PdfPCell CreateCell(Image img){
        PdfPCell c = new PdfPCell(img);
        c.setBorderColor(Color.WHITE);
        c.setPaddingBottom(12);
        c.setBorder(0);
        return c;
    }
}
