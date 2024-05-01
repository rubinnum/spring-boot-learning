# Notes

The concept of **dependency injection (DI)**
- Components annotated with stereotypes like <code>@Component</code>, <code>@Service</code>, <code>@Repository</code>, etc., indicate their role in the application.
- Dependencies are injected into components using <code>@Autowired</code> annotation on *fields, constructors*, or *setter methods*.
- **During application startup**, Spring scans for components and creates instances of them, managing their lifecycle within the application context.
- Spring resolves dependencies *by looking for matching beans* in the application context and automatically injecting them into dependent components.
- ***Beans are instantiated only once***, and the same object instance is used for all references within the application context.