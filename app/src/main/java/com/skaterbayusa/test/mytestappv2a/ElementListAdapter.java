package com.skaterbayusa.test.mytestappv2a;



import java.util.List;
/*
public class ElementListAdapter extends RecyclerView.Adapter<ElementListAdapter.ElementListViewHolder> {

    private List<Element> elementList;

    public ElementListAdapter(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public ElementListViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        RecyclerItemBinding itemBinding = RecyclerItemBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);

        return new ElementListViewHolder(itemBinding);
    }

    @Override
    public onBindViewHolder(
            ElementListViewHolder holder, int position){
        String elementID = elementID.get(position).getElementID;
        holder.bind(elementID);
    }

    @Override
    public int getItemCount(){
        return elementList.size();
    }

    public void setElementList(List<Element> elementList){
        this.elementList = elementList;
        notifyDatSetChanged();
    }

    static class ElementListViewHolder extends RecyclerView.ViewHolder {

        RecyclerItemBinding binding;

        ElementListViewHolder(RecyclerItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(String elementID){
            binding.element;
        }
    }
    /*
    class ElementViewHolder extends RecyclerView.ViewHolder {
          private final TextView elementItemView;

          private ElementViewHolder(View itemView) {
              super(itemView);
              elementItemView = itemView.findViewById(R.id.textView);
          }
      }

      private final LayoutInflater mInflater;
      private List<Element> mElements;  //Cached copy of element

    ElementListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public ElementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new ElementViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ElementViewHolder holder, int position) {
        if (mElements != null) {
            Element current = mElements.get(position);
            holder.elementItemView.setText(current.getElement());
        } else {
            // Covers the case of data not being ready yet.
            holder.elementItemView.setText("No Element");
        }
    }

    void setElements(List<Element> elements){
        mElements = elements;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mElements has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (mElements != null)
            return mElements.size();
        else return 0;
    }
    */
/*
}
*/
