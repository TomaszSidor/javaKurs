package pl.sda.blok1.encapsulation.item;

class ItemUtil {
    public String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}
