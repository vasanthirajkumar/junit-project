import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.*;
 
public class ContactManagerTest {
 
    @Test
    @DisplayName("Should Create Contact")
    public void shouldCreateContact() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Vasanthi", "Rajkumar", "0123456789");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }
}