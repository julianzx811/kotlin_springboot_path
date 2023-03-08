package com.yuliancode;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.PostUpdate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
// @EnableAutoConfiguration
// @ComponentScan(basePackages = "com.yuliancode")
// @Configuration
@RestController
@RequestMapping("api/v1/customer")
public class Main {

  private final CustomerRepository customerRepository;

  public Main(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

//ENDPOINTS
  @GetMapping
  public List<Customer> GetCustomers(){
    return customerRepository.findAll();
  }

  @PostMapping
  public void AddCustomers(@RequestBody NewCustomer request){
    Customer customer = new Customer();
    customer.setEmail(request.email());
    customer.setName(request.name());
    customer.setAge(request.age());
    customerRepository.save(customer);
  }

  @DeleteMapping("{customerid}")
  public void DeleteCustomer(@PathVariable("customerid") Integer id){
    customerRepository.deleteById(id);
  }

  @PutMapping("{customerid}")
  public String UpdateCustomer(@PathVariable("customerid") Integer id, @RequestBody NewCustomer request){
    Optional<Customer> customer = customerRepository.findById(id);
    if(customer.isPresent()){
      Customer cutomercito =  customer.get();
      cutomercito.setAge(request.age());
      cutomercito.setEmail(request.email());
      cutomercito.setName(request.name());
      customerRepository.save(cutomercito);
      return "customer modifed";
    }
    else{
      return "customer donts exist";
    }
  }
  record NewCustomer(String name,String email, Integer age){
  }

//  @GetMapping("/greet")
//  public yulian ElYulian(){
//    yulian theyulian = new yulian("yuli",List.of("arch","ubuntu"),new Pc("thinkpad"));
//    return theyulian;
//  }
//  record Pc(String nombrePC){}
//  record yulian(String nombre,List<String> distribuciones,Pc compu){}
}
