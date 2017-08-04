package com.testspring.domain;

import javax.persistence.*;

/**
 * Created by mmilcic on 2/21/2017.
 */


@MappedSuperclass
public abstract class BaseEntity<K> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_seq")
    @SequenceGenerator(allocationSize = 1, name = "default_seq", sequenceName = "DEFAULT_SEQ")
    private Long id;

    //https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
    @Transient
    protected int HASH_CODE = 31;

    @Version
    @Column(name = "VERSION")
    private long version;

    public Long getId(){
        return  id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private int calculateHashCode(){
        return 31;
    }
}
