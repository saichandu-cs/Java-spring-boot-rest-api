//
//package com.gs.Albums;
//
//
//import com.gs.Albums.models.Albums;
//import com.gs.Albums.models.Photos;
//import com.openpojo.reflection.PojoClass;
//import com.openpojo.reflection.impl.PojoClassFactory;
//import com.openpojo.validation.Validator;
//import com.openpojo.validation.ValidatorBuilder;
//import com.openpojo.validation.rule.impl.EqualsAndHashCodeMatchRule;
//import com.openpojo.validation.rule.impl.GetterMustExistRule;
//import com.openpojo.validation.rule.impl.SetterMustExistRule;
//import com.openpojo.validation.test.impl.GetterTester;
//import com.openpojo.validation.test.impl.SetterTester;
//import com.openpojo.validation.test.impl.ToStringTester;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//public class A {
//    @Test
//    public void testGetterSetter() {
//        PojoClass pojoclass = PojoClassFactory.getPojoClass(Photos.class);
//        Validator validator = ValidatorBuilder
//                .create()
//                .with(new SetterMustExistRule())
//                .with(new GetterMustExistRule())
//                .with(new SetterTester())
//                .with(new GetterTester())
//                .with(new EqualsAndHashCodeMatchRule())
//                .build();
//        validator.validate(pojoclass);
//    }
//}
