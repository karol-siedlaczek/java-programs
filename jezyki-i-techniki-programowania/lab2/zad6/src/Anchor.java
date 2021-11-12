public class Anchor {
    Element first;

    Anchor() {
        first = null;
    }

    void InsertAtTheFront(int x) {
        Element nowy_element;
        if (first == null) {
            nowy_element = new Element(x, null);
            first = nowy_element;
        } else {
            nowy_element = new Element(x, first);
            first = nowy_element;
        }
    }

    Element InsertAtTheEnd(int x, Element element) {
        Element nowy_element;
        if (first == null) {
            nowy_element = new Element(x, null);
            first = nowy_element;
        } else {
            nowy_element = new Element(x, element.next);
            element.next = nowy_element;
        }
        return nowy_element;
    }

    void removeFirst() {
        if (first == null) {
            System.out.println("Lista jednokierunkowa jest pusta");
        } else {
            Element x = first;
            first = x.next;
            System.out.println("Usunieto pierwsza wartosc, czyli: " + x.wartosc);
        }
    }

    void removeLast() {
        Element do_usuniecia = first;
        Element przedostatni = null;
        if (first == null)
            System.out.println("Lista jednokierunkowa jest pusta");
        else {
            while (do_usuniecia.next != null) {
                przedostatni = do_usuniecia;
                do_usuniecia = do_usuniecia.next;

                if (do_usuniecia.next == null) {
                    System.out.println("Usunieto ostatnia wartosc, czyli: " + do_usuniecia.wartosc);
                    przedostatni.next = do_usuniecia.next;
                }
            }
        }
    }

    boolean isLoop(){
        if(first == null){
            System.out.println("Lista jednokierunkowa jest pusta");
            return false;
        }

        Element slow_pointer = first;
        Element fast_pointer = first;

        while(true){
            slow_pointer = slow_pointer.next;

            if(fast_pointer != null)
                fast_pointer = fast_pointer.next.next;
            else
                return false;

            if(slow_pointer == null || fast_pointer == null)
                return false;

            if(slow_pointer == fast_pointer)
                return true;
        }
    }

    boolean isLoop2(){
        if(first == null){
            System.out.println("Lista jednokierunkowa jest pusta");
            return false;
        }

        Element slow_pointer = first;
        Element fast_pointer = first;

        while(fast_pointer != null && fast_pointer.next != null) {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;

            if(slow_pointer == fast_pointer)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Element x = first;
        String cala_lista = "[";
        while (x != null) {
            cala_lista = cala_lista.concat((Integer.toString(x.wartosc)) + ",");
            x = x.next;
        }
        if (cala_lista.endsWith(","))
            cala_lista = cala_lista.substring(0, cala_lista.length() - 1);
        cala_lista = cala_lista.concat("]");
        return cala_lista;
    }

    /*@Override
    public boolean equals(Object o){//cos mi nie wychodzilo zrobienie tej metody, wiec odpuscilem
        //lista_jednokierunkowa1.toString();
        return true;
    }*/
}

