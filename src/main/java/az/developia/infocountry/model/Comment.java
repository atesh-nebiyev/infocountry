package az.developia.infocountry.model;

import lombok.*;

@EqualsAndHashCode (callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment extends BaseModel {
    private Long id;
    private Comment parent;
    private User user;
    private Country country;
    private String comment;
    private CommentStatus status;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comment{");
        sb.append("id=").append(id);
        sb.append(", parent=").append(parent == null ? null : parent.toString());
        sb.append(", user=").append(user);
        sb.append(", country=").append(country);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}

