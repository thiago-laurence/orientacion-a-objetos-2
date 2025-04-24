package ar.edu.unlp.info.oo2.Ejercicio13_AccesoABaseDeDatos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseRealAccessTest {

	private DatabaseAccess database;
	private DatabaseProxyAccess proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseProxyAccess(this.database, "ok");
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

//    @Test
//    void testInsertNewRow() {
//        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
//        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
//    }
//    
//    @Test
//    void testProxyGetSearchResults() {
//        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
//        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
//        
//        assertThrows(RuntimeException.class, () -> new DatabaseProxyAccess(this.database, "notOk"));
//    }
//
//    @Test
//    void testProxyInsertNewRow() {
//        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
//        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
//        
//        assertThrows(RuntimeException.class, () -> new DatabaseProxyAccess(this.database, "notOk"));
//    }
}
