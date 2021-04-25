module labs.file {
    requires java.logging;
    requires labs.pm;
    provides com.javase11.certification.productmanagement.service.ProductManager
            with com.javase11.certification.productmanagement.service.file.ProductFileManager;
}