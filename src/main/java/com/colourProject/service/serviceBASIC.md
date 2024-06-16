Using 
# @RequiredArgsConstructor along with @Autowired is a common practice in Spring to inject dependencies efficiently and in a more readable manner. Let's break down the purpose of each and why they are used together.

---

1. @RequiredArgsConstructor
   The @RequiredArgsConstructor annotation is provided by the Lombok library. It generates a constructor with required arguments, which are the final fields and fields with constraints such as @NonNull. This constructor is used to inject dependencies.

2. @Autowired
The @Autowired annotation is used by Spring to mark a constructor, field, or setter method for dependency injection. Spring will automatically inject the required bean into the marked field or constructor parameter.
---
When used on a constructor, @Autowired indicates to Spring that it should use this constructor to create the bean, injecting the necessary dependencies.

However, when using @RequiredArgsConstructor, the constructor is implicitly created by Lombok, and Spring can use this constructor for dependency injection without explicitly marking it with @Autowired.

Putting It All Together
When @RequiredArgsConstructor is used in a Spring-managed bean (like a @Service or @Controller), Spring will automatically use the generated constructor for dependency injection. This works seamlessly without the need to explicitly use @Autowired.