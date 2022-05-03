class OOPDriver {
    public static void main(String args[]) {
        EncapsulatedPerson ep = new EncapsulatedPerson();
        ep.setAge = (12);
        System.out.println(ep.setAge());

        EncapsulatedPerson ep2 = new EncapsulatedPerson("Bob", 30, 111223334, 'm', "12-25-1970", "blonde");

        System.out.println(ep2.getName());
        System.out.println(ep2.getAge());
        System.out.println(ep2.getSocialSecurity());
        System.out.println(ep2.getGender());
        System.out.println(ep2.getDateofBirth());
        System.out.println(ep2.getHairColor());
    }
}